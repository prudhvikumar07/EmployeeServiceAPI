package com.EmployeeRestApi.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeRestApi.demo.Employee;
import com.EmployeeRestApi.demo.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	EmployeeServiceImpl employeeService;

	public EmployeeController(EmployeeServiceImpl employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/{id}")
	   public ResponseEntity<Employee> getEmployee(@PathVariable("id") String id) {
		  
	       return ResponseEntity.ok().body(employeeService.getEmployee(id));
		   
	   }
	
	 @GetMapping()
	    public List<Employee> getAllEmployeeDetails()
	    {
	        return employeeService.getAllEmployees();
	    }
	 
	 @PostMapping()
	 public String createEmployee(@RequestBody Employee employee) {
		 
		 employeeService.createEmployee(employee);
		 return"Employee Details Added Succesfully!!";
	 }
	 
	 @PutMapping()
	 public String updateEmployee(@RequestBody Employee employee) {
		 employeeService.updateEmployee(employee);
		 return "Employee Details Updated Succesfully!!";
	 }
	 
	 @DeleteMapping("{id}")
	 public String deleteEmployee(@PathVariable("id") String id) {
		 employeeService.deleteEmployee(id);
		 return "Employee Detaisl Deleted Succesfully!!";
	 }
	

}

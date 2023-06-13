package com.EmployeeRestApi.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.EmployeeRestApi.demo.Employee;
import com.EmployeeRestApi.demo.exception.EmployeeNotFoundException;
import com.EmployeeRestApi.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepository employeeRepository;

	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	
	public String createEmployee(Employee employee) {
		
		employeeRepository.save(employee);
		
		return "Success";
	}

	
	public String updateEmployee(Employee employee) {
		employeeRepository.save(employee);
		return null;
	}

	
	public String deleteEmployee(String id) {
		employeeRepository.deleteById(id);
		return null;
	}


	public Employee getEmployee(String id)  {
		
		
	//	if(employeeRepository.findById(id).isEmpty())
		//     throw new EmployeeNotFoundException("Employee not found...");
		return	employeeRepository.findById(id).get();
			
	}

	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
		
	}

}

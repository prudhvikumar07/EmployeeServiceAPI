package com.EmployeeRestApi.demo.service;

import java.util.List;

import com.EmployeeRestApi.demo.Employee;

public interface EmployeeService {
	
	public String createEmployee(Employee employee);
    public String updateEmployee(Employee employee);
    public String deleteEmployee(String id);
    public Employee getEmployee(String id);
    public List<Employee> getAllEmployees();
  //  public List<Employee> getByVendorName(String vendorName);

}

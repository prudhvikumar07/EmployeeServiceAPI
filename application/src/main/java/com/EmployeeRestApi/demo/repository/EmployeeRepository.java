package com.EmployeeRestApi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.EmployeeRestApi.demo.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,String> {

}

package com.EmployeeRestApi.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class Employee {
	
	@Id
	private String id;
	private String name;
	private String designation;
	private String address;
	private String mobileNum;
	
	public Employee() {
		
	}
	
	public Employee(String id, String name, String designation, String address, String mobileNum) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
		this.mobileNum = mobileNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", address=" + address
				+ ", mobileNum=" + mobileNum + "]";
	}

}

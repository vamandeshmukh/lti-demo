package com.lti.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	int employeeId;
	String firstName;
	double salary;

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}

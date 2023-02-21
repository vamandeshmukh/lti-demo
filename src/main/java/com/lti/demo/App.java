package com.lti.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App {

	public static void main(String[] args) {

//		Employee emp = new Employee();
//		System.out.println(emp.toString());

		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());

	}
}

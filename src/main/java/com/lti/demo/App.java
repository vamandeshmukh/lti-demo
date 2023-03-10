package com.lti.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) throws InterruptedException {

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		for (int i = 1; i <= 10; i++) {
//			Thread.sleep(250);
//			System.out.println(i);
//		}

		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.toString());

	}
}

//package com.lti.demo;
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
//
//@ComponentScan
//public class App {
//
//	public static void main(String[] args) {
//
////		Employee emp = new Employee();
////		Employee emp2 = new Employee();
//////		Employee emp2 = new Employee(102, "Monu", 12.5);
////
////		System.out.println(emp.hashCode());
////		System.out.println(emp2.hashCode());
////		System.out.println(emp.equals(emp2));
//
//		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//
//		Employee emp = context.getBean(Employee.class); // spring 
////		Employee emp = someOther.getBean(); // other framework 
//
//		Employee emp2 = context.getBean(Employee.class);
//		System.out.println(emp.toString());
//		System.out.println(emp2.toString());
//		emp.salary = 10.5;
//		System.out.println(emp.toString());
//		System.out.println(emp2.toString());
//		emp2.salary = 12.5;
//		System.out.println(emp.toString());
//		System.out.println(emp2.toString());
//		System.out.println(emp.hashCode());
//		System.out.println(emp2.hashCode());
//		System.out.println(emp.equals(emp2));
//
//	}
//}

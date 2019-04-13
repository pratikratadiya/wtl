package com.pratik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {
	public static void main(String args[]) {
		//1. Configure string container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//2. Get the bean
		Employee employee = context.getBean("employee",Employee.class);
		
		//3. Call the pojo
		System.out.println(employee);
		
		Employee employee2 = context.getBean("employee",Employee.class);
		
		if(employee == employee2) {
			System.out.println("Scope is singleton");
		}
		else {
			System.out.println("Scope is prototype");
		}
		//4. Close the context for XML Application context
		
	}
}

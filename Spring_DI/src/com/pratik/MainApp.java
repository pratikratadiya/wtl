package com.pratik;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String args[]) {
		//1. Configure your spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2. get bean
		Coach coach = context.getBean("myCoach",CricketCoach.class);
		//3. call functionality
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getDailyFortune());
		//4. close context
	}
}

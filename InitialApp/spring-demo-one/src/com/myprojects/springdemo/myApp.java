package com.myprojects.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class myApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context =
			new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve the bean from the spring container
		Coach theCoach = context.getBean("myCoach", BoxingCoach.class);
		BoxingCoach secondCoach = context.getBean("myCoach", BoxingCoach.class);
		
		secondCoach.setAge(52);
		secondCoach.setEmail("second@coach.com");
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getAdvice());
		System.out.println(theCoach.getInformation());
		
		
		System.out.println("This second coach is made using the prototype scoping so it is a different instance");
		System.out.println(secondCoach.getDailyWorkout());
		System.out.println(secondCoach.getAdvice());
		System.out.println(secondCoach.getInformation());
		//close the context
		context.close();
	}

}

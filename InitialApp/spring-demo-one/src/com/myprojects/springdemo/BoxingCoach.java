package com.myprojects.springdemo;

public class BoxingCoach implements Coach {

	private Advice statisticalAdvice;
	private String email;
	private int age;
	
	//Defining my Setter methods
	public void setStatisticalAdvice(Advice coachAdvice){
		System.out.println("Inside setter method");
		this.statisticalAdvice = coachAdvice;
	}
	
	public void setEmail(String coachEmail){
		System.out.println("Inside setter method");
		this.email = coachEmail;
	}
	
	public void setAge(int coachAge){
		System.out.println("Inside setter method");
		this.age = coachAge;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 1 hour on road work";
	}

	@Override
	public String getAdvice() {
		return statisticalAdvice.getAdvice();
	}

	public String getInformation() {
		return "The coach is " + age + " and their email is : " + email;
	}

}

package com.myprojects.springdemo;

public class StatisticalAdvice implements Advice{

	@Override
	public String getAdvice() {
		return "Your peak performance time is usually around 8:00am today";
	}
	
	

}

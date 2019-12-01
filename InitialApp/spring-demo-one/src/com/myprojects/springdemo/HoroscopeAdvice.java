package com.myprojects.springdemo;

public class HoroscopeAdvice implements Advice {

	@Override
	public String getAdvice() {
		return "Today is your lucky day!";
	}

}

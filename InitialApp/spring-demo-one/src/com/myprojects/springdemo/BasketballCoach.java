package com.myprojects.springdemo;

public class BasketballCoach implements Coach {
	
	private Advice horoscope;
	
	public BasketballCoach(HoroscopeAdvice theHoroscope) {
		this.horoscope = theHoroscope;
		System.out.println("Inside arg constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Shoot 100 Free Throws";
		
	}
		
	public String getAdvice() {
		return horoscope.getAdvice();
	}

	@Override
	public String getInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}

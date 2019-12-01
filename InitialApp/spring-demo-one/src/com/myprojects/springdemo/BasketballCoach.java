package com.myprojects.springdemo;

public class BasketballCoach implements Coach {
	
	private Advice horoscope;
	
	public BasketballCoach(HoroscopeAdvice theHoroscope) {
		horoscope = theHoroscope;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Shoot 100 Free Throws";
		
	}
		
	public String getAdvice() {
		return horoscope.getAdvice();
	}

}

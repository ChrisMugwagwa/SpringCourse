package com.myprojects.springdemo;

public class FootballCoach implements Coach {
	
	Advice statistics;
	
	public FootballCoach() {
		
	}
	
	public void setStatistics(Advice myStatistic) {
		statistics = myStatistic;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Do 20 laps around the pitch";
	}

	@Override
	public String getAdvice() {
		// TODO Auto-generated method stub
		/*
		With an interface all methods must be implemented so sometimes
		you may have to leave a method stub like this one if you don't 
		want an this class to have an implementation for this method
		*/
		return statistics.getAdvice();
	}

}

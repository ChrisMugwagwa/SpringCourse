package com.myprojects.springdemo;

public class FootballCoach implements Coach {
	
	Advice statistics;
	
	public FootballCoach() {
		System.out.println("Inside no-arg constructor");
	}
	
	public void setStatistics(Advice myStatistic) {
		this.statistics = myStatistic;
		System.out.println("Inside Setter Method");
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

	@Override
	public String getInformation() {
		// TODO Auto-generated method stub
		return null;
	}

}

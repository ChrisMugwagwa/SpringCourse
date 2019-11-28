package com.myprojects.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Do 20 laps around the pitch";
	}

}

package com.pratik;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	
	@Override
	public String getDailyWorkOut() {
		return "Practice 15 mins daily";
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}

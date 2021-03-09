package com.hotel;

public class Hotel {
	
    private String name;
    private int rate;
    private int weekdayrate;
    private int weekendrate;
    private int rewardweekdayrate;
    private int rewardweekendrate;
	
	@Override
	public String toString() {
		return "HotelDetails [ name=" + name + ", rate = " + rate + ", weekdayrate = " + weekdayrate + ", weekendrate = "
				+ weekendrate + ", rewardweekdayrate = " + rewardweekdayrate + ", rewardweekendrate = " + rewardweekendrate
				+ " ]";

	public int getRate() {
		return rate;
	}
		
	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeekdayrate() {
		return weekdayrate;
	}

	public void setWeekdayrate(int weekdayrate) {
		this.weekdayrate = weekdayrate;
	}

	public int getWeekendrate() {
		return weekendrate;
	}

	public void setWeekendrate(int weekendrate) {
		this.weekendrate = weekendrate;
	}

	public Hotel(String name, int rate, int weekdayrate, int weekendrate, int rewardweekdayrate, int rewardweekendrate) {
		super();
		this.name = name;
		this.rate = rate;
		this.weekdayrate = weekdayrate;
		this.weekendrate = weekendrate;
		this.rewardweekdayrate = rewardweekdayrate;
		this.rewardweekendrate = rewardweekendrate;
	}

	public int getRewardweekdayrate() {
		return rewardweekdayrate;
	}

	public void setRewardweekdayrate(int rewardweekdayrate) {
		this.rewardweekdayrate = rewardweekdayrate;
	}

	public int getRewardweekendrate() {
		return rewardweekendrate;
	}

	public void setRewardweekendrate(int rewardweekendrate) {
		this.rewardweekendrate = rewardweekendrate;
	}
}

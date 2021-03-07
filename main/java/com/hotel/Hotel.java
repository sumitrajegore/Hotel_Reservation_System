package com.hotel;

public class Hotel {
	
	private String name;
    private int rate;
    private int weekdayrate;
    private int weekendrate;
    
	


	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rate=" + rate + ", weekdayrate=" + weekdayrate + ", weekendrate="
				+ weekendrate + "]";
    
    public Hotel(String name, int rate) {
        this.setName(name);
        this.setRate(rate);
    }

	public int getRate() {
		return rate;
	}

	@Override
	public String toString() {
		return "Hotel [name=" + name + ", rate=" + rate + "]";
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

	public Hotel(String name, int rate, int weekdayrate, int weekendrate) {
		super();
		this.name = name;
		this.rate = rate;
		this.weekdayrate = weekdayrate;
		this.weekendrate = weekendrate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}
   
}

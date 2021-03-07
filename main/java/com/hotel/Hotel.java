package com.hotel;

public class Hotel {
	
	private String name;
    private int rate;

    public Hotel(String name, int rate) {
        this.setName(name);
        this.setRate(rate);
    }

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
}

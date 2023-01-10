package com.fdmgroup.interfacesExercise;

public class Toy implements BasketItem {

	private String name;
	private double price;
	private int minAge;
	private int maxAge;
	
	public Toy(String name, double price, int minAge, int maxAge) {
		super();
		this.name = name;
		this.price = price;
		this.minAge = minAge;
		this.maxAge = maxAge;
	}
	

	private int getMinAge() {
		return minAge;
	}

	private void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	private int getMaxAge() {
		return maxAge;
	}

	private void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}


	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName() {
	}


	@Override
	public double getPrice() {
		return price;
	}


	@Override
	public void setPrice() {
		// TODO Auto-generated method stub
		
	}
}


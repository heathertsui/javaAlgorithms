package com.fdmgroup.interfacesExercise;

public class ReadyMeal implements BasketItem, FoodItem {
	private String cuisineType;
	private String name;
	private double price;
	public int calories;

	public ReadyMeal(String cuisineType, String name, double price, int calories) {
		super();
		this.cuisineType = cuisineType;
		this.name = name;
		this.price = price;
		this.calories = calories;
	}

	@Override
	public int getCalories() {
		return calories;
	}

	@Override
	public void setCalories(int calories) {
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
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}


}

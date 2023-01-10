package com.fdmgroup.interfacesExercise;

public class Snack implements BasketItem, FoodItem {

	private String name;
	private double price;
	private int calories;
	private int fatContent;
	private int sugarContent;

	public Snack(String name, double price, int calories, int fatContent, int sugarContent) {
		super();
		this.name = name;
		this.price = price;
		this.calories = calories;
		this.fatContent = fatContent;
		this.sugarContent = sugarContent;
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

	private int getFatContent() {
		return fatContent;
	}

	private void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}

	private int getSugarContent() {
		return sugarContent;
	}

	private void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

}


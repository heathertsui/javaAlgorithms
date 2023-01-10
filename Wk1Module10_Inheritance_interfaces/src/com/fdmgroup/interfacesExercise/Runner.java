package com.fdmgroup.interfacesExercise;

public class Runner {

	public static void main(String[] args) {
		// Creating Objects
		Toy toy = new Toy("Teddy bear", 7.99, 5, 100);
		Laptop laptop = new Laptop("HP", 1500, 4.0, 200.0, 100.0);
		Snack yumSnack = new Snack("Borger", 8.99, 2000, 500, 200);
		Snack yuckSnack = new Snack("Grass", 1.99, 50, 30, 10);
		ReadyMeal yumMeal = new ReadyMeal("Italian", "Pittzha", 20.00, 9000);
		ReadyMeal yuckMeal = new ReadyMeal("Organic", "Dirt", 0.50, 20);

		Basket basket = new Basket();
		CalorieCounter calorieCounter = new CalorieCounter();

		// Calling methods
		basket.addItem(toy);
		basket.addItem(laptop);
		basket.addItem(yumSnack);
		basket.addItem(yuckSnack);
		basket.addItem(yumMeal);
		basket.addItem(yuckMeal);

		System.out.println("Items in basket");
		for (BasketItem item : basket.getAllItems()) {
			System.out.println(item.getName());
		}

		// Removing an item
		basket.removeItem(yuckMeal);
		
		System.out.println("\nItems in basket after removing dirt");
		for (BasketItem item : basket.getAllItems()) {
			System.out.println(item.getName());
		}

		System.out.println("\nCalories of low calorie foods");
		calorieCounter.addLowCalorieFood(yumMeal);
		calorieCounter.addLowCalorieFood(yuckMeal);
		calorieCounter.addLowCalorieFood(yumSnack);
		calorieCounter.addLowCalorieFood(yuckSnack);

		// Adding non eatables
		// calorieCounter.addLowCalorieFood(toy);
		// calorieCounter.addLowCalorieFood(laptop);


		for (FoodItem item : calorieCounter.getAllLowCalorieFoods()) {
			System.out.println(item.getCalories());
		}

	}

}

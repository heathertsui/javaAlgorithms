package com.fdmgroup.interfacesExercise;

import java.util.ArrayList;

public class Basket {
	private ArrayList<BasketItem> basketItems = new ArrayList<>();

	public void addItem(BasketItem item) {
		basketItems.add(item);
	}

	public void removeItem(BasketItem item) {
		basketItems.remove(item);
	}

	public ArrayList<BasketItem> getAllItems() {
		return basketItems;
	}

}

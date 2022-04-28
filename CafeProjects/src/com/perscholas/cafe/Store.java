package com.perscholas.cafe;

import java.util.ArrayList;

public class Store {

	private ArrayList<Product> inventory;
	
	public Store() {
		inventory = new ArrayList<>();
	}
	
	public Store(ArrayList<Product> inventory) {
		this.inventory = new ArrayList<>(inventory);
	}

	public ArrayList<Product> getInventory() {
		return inventory;
	}
}

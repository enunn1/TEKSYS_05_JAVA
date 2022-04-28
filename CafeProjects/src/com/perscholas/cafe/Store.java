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
	
	public boolean add(Product p) {
		return inventory.add(p);
	}
	
	public int numProducts() {
		return inventory.size();
	}
	
	public Product get(int index) {
		return inventory.get(index);
	}
}

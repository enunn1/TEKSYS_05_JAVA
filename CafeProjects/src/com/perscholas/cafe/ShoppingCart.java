package com.perscholas.cafe;

import java.util.ArrayList;

public class ShoppingCart {

	private ArrayList<Product> cartItems;
	
	public ShoppingCart() {
		cartItems = new ArrayList<>();
	}
	
	public ShoppingCart(ArrayList<Product> cartItems) {
		this.cartItems = new ArrayList<>(cartItems);
	}

	public ArrayList<Product> getCartItems() {
		return cartItems;
	}
	
	public boolean add(Product p) {
		return cartItems.add(p);
	}
	
}

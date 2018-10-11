package com.fdmgroup;

import java.util.ArrayList;
import java.util.List;

public class FruitCart {
	private List<FruitAmount> cartContents = new ArrayList<>();
	private double totalPrice = 0;
	private int totalItemsInCart = 0;

	public FruitCart(List<FruitCart> cartContents) {
		this.cartContents = new ArrayList<>();
	}

	public FruitCart() {
	}

	public double getTotalPrice() {
		for (FruitAmount fruit : cartContents) {
			totalPrice = totalPrice + (fruit.getPrice() * fruit.getAmount());
		}
		return totalPrice;
	}

	public int getCartSize() {
		for (FruitAmount fruit : cartContents) {
			totalItemsInCart = totalItemsInCart + fruit.getAmount();
		}
		return totalItemsInCart;
	}

	public void getFruitsInCart(String fruitName, double price, int amount) {
		FruitAmount fruit = new FruitAmount(fruitName, price, amount);
		cartContents.add(fruit);

	}
}
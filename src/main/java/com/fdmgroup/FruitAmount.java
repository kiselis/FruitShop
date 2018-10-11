package com.fdmgroup;

public class FruitAmount {

	private String fruitName;
	private double price;
	private int amount;

	public FruitAmount(String fruitName, double price, int amount) {
		this.price = price;
		this.amount = amount;
		this.fruitName = fruitName;
	}

	public FruitAmount() {

	}

	double getPrice() {
		return price;
	}

	int getAmount() {
		return amount;
	}

	String getName() {
		return fruitName;
	}

}

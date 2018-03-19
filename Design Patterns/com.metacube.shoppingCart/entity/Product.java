package com.metacube.shoppingCart;

public class Product extends Entity {
	String name;
	int code;
	float price;

	void setName(String name) {
		this.name = name;
	}
	void setCode(int code) {
		this.code = code;
	}
	void setPrice(float price) {
		this.price = price;
	}

	int getCode() {
		return code;
	}
	String getName() {
		return name;
	}
	float getPrice() {
		return price;
	}
}
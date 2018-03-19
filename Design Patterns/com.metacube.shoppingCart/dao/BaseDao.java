package com.metacube.shoppingCart;

public interface BaseDao {
	public List<Product> getAll();
	public status addProduct(Product p);
}
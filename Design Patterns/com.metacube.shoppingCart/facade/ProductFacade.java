package com.metacube.shoppingCart;

public class ProductFacade {
	private static ProductFacade instance;

	InMemoryDao productList = (InMemoryDao) ProductFactory.getInstance(db.InMemory);

	public static ProductFacade getInstance() {
		if(instance == null) {
			instance = new ProductFacade();
		}

		return obj;
	}

	private ProductFacade() {
	
	}

	public List<Product> getAll() {
		return productList.getAll();
	}

	public status addProduct(Product product) {
		return productList.addProduct(product);
	}
}
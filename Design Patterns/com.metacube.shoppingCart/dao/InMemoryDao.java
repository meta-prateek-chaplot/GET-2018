package com.metacube.shoppingCart;

public class InMemoryDao implements BaseDao {
	Map<String, Product> productMap = new HashMap<>();

	public List<Product> getAll() {
		List<Product> list = new ArrayList<Product>(productMap.values());
		return list;
	}

	public status addProduct(Product product) {
		this.productMap.put(product.getId(), product);
		return status.Created;
	}
}
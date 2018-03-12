package dao;

import java.util.List;

import entity.ShoppingCartProduct;
import enums.Status;

public interface BaseDao {
	public List<ShoppingCartProduct> getAllShoppingCartProducts();
	public Status addShoppingProduct(ShoppingCartProduct p);
	public Status deleteShoppingProduct(int id);
	public Status updateShoppingProduct(int productId, int quantity);
}

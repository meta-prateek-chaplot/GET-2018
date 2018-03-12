package facade;

import java.util.List;

import enums.*;
import entity.*;
import dao.*;

public class ShoppingCartProductFacade {
	private static ShoppingCartProductFacade shoppingCartProductFacade;
	
	// object of particular database 
	InMemoryShoppingCartDao inMemoryShoppingCartDao = (InMemoryShoppingCartDao) ProductFactory.getInstance(Db.INMEMORY);
	
	// singleton object
	public static ShoppingCartProductFacade getInstance() {
		if (shoppingCartProductFacade == null) {
			shoppingCartProductFacade = new ShoppingCartProductFacade();
		}
		
		return shoppingCartProductFacade;
	}
	
	private ShoppingCartProductFacade() {}
	
	// returns all shopping cart products
	public List<ShoppingCartProduct> getAllShoppingCartProducts(){
		return inMemoryShoppingCartDao.getAllShoppingCartProducts();
	}
	
	// adds product and return status
	public Status addShoppingProduct(ShoppingCartProduct product) {
		return inMemoryShoppingCartDao.addShoppingProduct(product);	
	}

	// delete product from shopping cart and return status
	public Status deleteShoppingProduct(int id) {
		return inMemoryShoppingCartDao.deleteShoppingProduct(id);
	}

	// update cart product
	public Status updateShoppingProduct(int productId, int quantity) {
		return inMemoryShoppingCartDao.updateShoppingProduct(productId , quantity);
	}
}

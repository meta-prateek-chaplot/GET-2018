package controller;

import java.util.List;

import facade.*;
import enums.*;
import entity.*;

public class ShoppingCartController {
	ShoppingCartProductFacade shoppingCartProductFacade = ShoppingCartProductFacade.getInstance();

	private static ShoppingCartController shoppingCartController;
	
	// singleton object
	public static ShoppingCartController getInstance() {
		if (shoppingCartController == null) {
			shoppingCartController = new ShoppingCartController();
		}
		
		return shoppingCartController;
	}
	
	// calls facade for adding product
	public Status addShoppingProduct(ShoppingCartProduct product){
		return shoppingCartProductFacade.addShoppingProduct(product);
	}
	
	// calls facade for fetching all shopping cart product list
	public List<ShoppingCartProduct> getAllShoppingCartProducts(){
		return shoppingCartProductFacade.getAllShoppingCartProducts();
	}

	// calls facade for deleting product in shopping cart list
	public Status deleteShoppingProduct(int id) {
		return shoppingCartProductFacade.deleteShoppingProduct(id);
	}

	// calls facade for updating product in shopping cart list
	public Status updateShoppingProduct(int productId, int quantity) {
		return shoppingCartProductFacade.updateShoppingProduct(productId , quantity);
	}
}

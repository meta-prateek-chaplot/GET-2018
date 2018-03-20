package controller;

import java.util.List;

import dao.*;
import entity.*;
import enums.*;
import facade.*;

public class Controller {
	ShoppingCartProductFacade shoppingCartProductFacade = ShoppingCartProductFacade.getInstance();
	
	ProductFacade productFacade = ProductFacade.getInstance();
	
	private static Controller obj;
	
	// singleton object
	public static Controller getInstance() {
		if (obj == null) {
			obj = new Controller();
		}
		
		return obj;
	}
	
	// calls facade for adding product
	public Status addShoppingProduct(ShoppingCartProduct product){
		return shoppingCartProductFacade.addShoppingProduct(product);
	}
	
	// calls facade for fetching all shopping cart product list
	public List<ShoppingCartProduct> getAllShoppingCartProducts(){
		return shoppingCartProductFacade.getAllShoppingCartProducts();
	}
	
	// initialize product list
	public Status productInitialization(){
		ProductDao productdao = ProductDao.getInstance();
		productdao.ProductInitialization();
		return Status.CREATED;
	}

	// calls facade for fetching product list
	public List<Product> getAllProducts() {
		return productFacade.getAllProducts();
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

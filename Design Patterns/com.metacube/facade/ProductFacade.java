package facade;

import java.util.List;

import dao.*;
import entity.*;
import enums.*;

public class ProductFacade {
	InMemoryProductDao productdao =InMemoryProductDao.getInstance();
	
	private static ProductFacade productFacade;
	
	// singleton object
	public static ProductFacade getInstance() {
		if (productFacade == null) {
			productFacade = new ProductFacade();
		}
		return productFacade;
	}
	
	// returns list of all products in database
	public List<Product> getAllProducts() {
		return productdao.getProductList();
	}

	public static Status productInitialization() {
		InMemoryProductDao productdao = InMemoryProductDao.getInstance();
		return Status.CREATED;
	}
}

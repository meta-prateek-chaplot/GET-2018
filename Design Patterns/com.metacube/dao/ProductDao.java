package dao;

import java.util.ArrayList;
import java.util.List;

import entity.*;
import enums.*;

public interface I_ProductDao {
		// product list
		static List<Product> productList = new ArrayList<Product>();;
		private static ProductDao obj;
		
		// database class object
		BaseDao basedao =(InMemoryDao) ProductFactory.getInstance(Db.INMEMORY);
		
		// singleton object
		public static ProductDao getInstance() {
		
		}
		
		// initialize product list
		public void ProductInitialization(){
			
		}
		
		// returns product list
		public static List<Product> getProductList() {
			
		}
}

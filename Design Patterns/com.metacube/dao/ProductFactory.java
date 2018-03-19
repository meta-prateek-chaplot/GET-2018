package dao;

import enums.*;

public class ProductFactory {
	private static BaseDao basedao;
	public static BaseDao getInstance(Db dbName) {
		
		switch(dbName) {
			case INMEMORY : basedao = new InMemoryShoppingCartDao();
							return basedao;
							
			case SQL : return null;
		}
		return null;	
	
	}
	
	private ProductFactory() {}
}

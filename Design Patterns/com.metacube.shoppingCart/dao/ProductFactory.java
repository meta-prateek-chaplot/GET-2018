package com.metacube.shoppingCart;

public class ProductFactory {
	private static BaseDao dbType;

	public static BaseDao getInstance(db dbName) {
		switch(dbName) {
			case InMemory: dbType = new InMemoryDao();
								return dbType;

			case Sql: return null;
		}

		return null;
	}

	private ProductFactory() {
		
	}
}
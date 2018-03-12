package entity;

public class Product extends BaseEntity {
	private int id ;
	private String name;
	private float price;
	private int stock;
	
	public Product(int id, String name, float price, int stock) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock -= stock;
	}
	
	public void setUpdatedStock(int quantity){
		this.stock += quantity;
	}
}

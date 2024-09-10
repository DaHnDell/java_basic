package mart;

public abstract class Product {
	//	최고 조상님(모든 물품)
	
	private String name;
	private int price;
//	private String

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "[" + name + "," + price + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

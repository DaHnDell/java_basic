package hw0910_2;

public abstract class Shape { // 최고 조상님
	private String name; //getter , setter
//	private int x;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Shape(String name) {
		super();
		this.name = name;
	}
	
	public abstract double area();
	
	
}

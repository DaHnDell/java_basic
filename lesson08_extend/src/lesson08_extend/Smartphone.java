package lesson08_extend;

public class Smartphone extends Phone{
	
	public Smartphone() { }
	
	public Smartphone(String name, String color, String company) {
		super(name, color, company);
		// TODO Auto-generated constructor stub
	}

	void installApp() {
		System.out.println("앱 설치");
	}
	
}

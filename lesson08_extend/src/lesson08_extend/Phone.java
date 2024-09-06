package lesson08_extend;

public class Phone extends Object {
	String name;
	String color;
	String company;
	
	public Phone(){}
	@Override // 조상 클래스가 가지고 있던 어떤 것을 계승하는 것
	public String toString() {
		return this.getClass().getSimpleName() + "[name=" + name + ", color=" + color + ", company=" + company + "]";
	}
	public Phone(String name, String color, String company) {
		super();
		this.name = name;
		this.color = color;
		this.company = company;
	}
	
	void call() {
		System.out.println("전화 걸기");
	}
	void receive() {
		System.out.println("전화 받기");
	}
}

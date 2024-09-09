package day2;

public class SuperEx2 {
	public static void main(String[] args) {
		Child child = new Child();
		child.print();
	}
}
class Parent{
	int number = 3;
	public Parent(int number) {
		super();
		System.out.println("부모 객체 생성");
	}
	
	Object m() {
		return null;
	}
}
class Child extends Parent{ // 부모로부터 확장
//	int number = 2;	
	public Child() {
		super(10);
		System.out.println("자식 객체 생성");
	}
	
	Integer m() {
		return 0;
	}
	
	void print() {
//		int number = 1;
		System.out.println(number);
		System.out.println(this.number);
		System.out.println(super.number);
	}
}


package day2.ex2;

public class Programmer extends Employee {
	public Programmer(String name) {
		super (name);
	}
	
	void work() {
		System.out.println("코딩"); // 오버라이드. work 부분을 재정의했음.
	}
	
}

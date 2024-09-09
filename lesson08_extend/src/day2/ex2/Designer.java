package day2.ex2;

public class Designer extends Employee {
	public Designer(String name) {
		super (name);
	}
	
	void work() {
		System.out.println("디자인"); // 오버라이드. work 부분을 재정의했음.
	}
	
}

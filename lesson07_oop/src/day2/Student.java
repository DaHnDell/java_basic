package day2;

public class Student {
	int no;
	String name;
	
	Student(){} // 기본 생성자, 추가 생성자의 순서를 웬만하면 지키면서 하는 것이 보기 좋다.
	Student(int i, String s){
		super();
		no = i;
		name = s;
	}
	Student(String s, int i){
		no = i;
		name = s;
	}
	Student(String s){
		name = s;
	}
	void printThis() {
		System.out.println(this);
	}
	
	Student returnThis() {
		return this;
	}
	
}

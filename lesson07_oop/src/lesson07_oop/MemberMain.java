package lesson07_oop;

public class MemberMain {
	Memeber member = new Memeber();
	int a = 10;
	public static void main(String[] args) {
		Memeber m = new Memeber(); // 어제 했던 게임
		m.age = 10;
		m.kor = 90;
		m.eng =60;
		m.mat = 80;
		Memeber m2 = new Memeber(); // 오늘 한 게임
		m2.kor = 80;
		m2.eng =100;
		m2.mat = 90;
		System.out.println(m.total());
		System.out.println(m2.total());
		
		
// 각각의 경우가 다른 인스턴스 ; 만들어진 인스턴스가 불리어지는 이름이 바로 객체
		// new 는 새로운 인스턴스를 만드는 연산자, 그리고 이것이 담기는 변수 느낌이 객체.
		// 클래스의 인스턴스 값을 비교하는 것
		// 클래스, 인터페이스, 배열 타입
		// 객체(변수)
		// = 
		// new Member() : 인스턴스

		if(m == m2) {
			System.out.println("m 과 m2는 같은 객체");
		}
		else {
			System.out.println("m 과 m2는 다른 객체");
		}
		
		MemberMain mm1 = new MemberMain();
		MemberMain mm2 = new MemberMain();
		MemberMain mm3 = new MemberMain();
		
	}
}

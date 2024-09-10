package lesson10_inner;

public class LocalTest {
	
	static MyInter create() { 
		// 메서드 선언 구간에서 클래스 만들기
		class MyClass implements MyInter{
			@Override
			public void run() {
				System.out.println("Myclass.run()");
			}
		}
		return new MyClass();
	}
	static MyInter create2() {
		return new MyInter() {
//	익명클래스는 자기 클래스 이름이 없기 때문에 생성자를 만들 수 없다.
			@Override
			public void run() {
				System.out.println("create2().run()");
			}
			};
		}
	static MyInter create3() {
		return() -> System.out.println("lambda.run()");
	} // 위에처럼 길게 쓰느니, 아래 람다식처럼 짧고 간결하게 쓸래!
	
	public static void main(String[] args) {
		MyInter mi = create();
		mi.run();
		create2().run();
		create3().run();
	}
}


interface MyInter {
	void run(); // abstract 메소드 런;
}
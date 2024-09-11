package lesson11_exeption;

public class ExceptionEx05 {
	public static void main(String[] args) {
		System.out.println("전");
		m1();
		System.out.println("후");
	}
	
	static void m1() {
		System.out.println("m2() 전");
		try{
			m2();
		}catch(ArithmeticException e){
			System.out.println("arithmetic 예외 처리");
		}
		System.out.println("m2() 후");
	}
	static void m2() {
		System.out.println("m2() 전");
		try{
			m3();	
		}catch(IndexOutOfBoundsException e) {
			System.out.println("배열 예외처리");
		}
		finally {
			System.out.println("m2 후 finally");
		}
		System.out.println("m2() 후");
	}
	static void m3() {
		m4
		();
	}
	static void m4() {
		// 로직 수행
		System.out.println(3/0);
	}
}

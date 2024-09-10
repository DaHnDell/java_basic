package lesson09_interface;

public class ComplexerMain {
	public static void main(String[] args) {
		Complexer complexer = new Complexer();
		System.out.println(Complexer.INK); // 구상클래스에서 선언한 걸로 데려오거나
		System.out.println(Printer.INK); // 인터페이스에서 선언한 걸로 데려오거나.
		System.out.println(Complexer.FAX_NUMBER);
		System.out.println(Fax.FAX_NUMBER);
		complexer.print();
		complexer.scan();
		complexer.send("02-8765-4321");
		complexer.receive("02-8765-4321");
		
		String a = "";
		
		Fax fax = new Fax() { // 팩스 인터페이스가 가지는 추상적 구현 책임을 묻는다.
			
			@Override
			public void send(String tel) {
				// TODO Auto-generated method stub
				System.out.println("FAX 송신");
				
			}
			
			@Override
			public void receive(String tel) {
				// TODO Auto-generated method stub
				System.out.println("FAX 수신");
			}
		};
		
		fax.send("abcd");
		
		Complexer com2 = new Complexer() {
			public void scan() {
				System.out.println("com 2 스캔");
			}
		};
		
		com2.print(); // 익명 구현 객체는 추후에 람다식으로 활용되기 적절함.
		// 인터페이스는 형용사 혹은 행위를 묘사하는 동사로 활용
		
		// comparator : 비교자 // 객체 생성의 목적
		// comparable : 클래스의 임플리먼트 형태(오버라이드 수식어?)
		
//		Comparable<T>;
//		comparable;
	}
}

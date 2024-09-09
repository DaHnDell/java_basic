package day2.ex2;

public class PolyEx {
	public static void main(String[] args) {
		// 조상타입 객체 = new 자손생성자();
		
		Child c = new Child();
		c.walk();
		c.run();
		c.eat();
		System.out.println(c);
		
		Parent p = new Child();
		p.walk();
		p.run();
		((Child)p).eat(); // 실행 지점까지는 컴파일러가 틀렸다고 판단하는 것
//		p.eat();
		System.out.println(p);
		
		Parent p2 = new Parent();
//		p2 = p; // p2에 child 가 들어가 있어서 , 문제가 발생하지 않음
//		((Child)p2).eat();
		
//		Uncle u = new Child();
		Uncle u = new Uncle();
//		((Child)u).walk(); // 상속관계도 아닌데 어떻게 캐스팅하려고??!?!?!?
//		((Parent)u).walk();
		
//		instanceof 연산자 : ~의 인스턴스인가? 불린의 형식의 답변, 별도의 캐스팅도 필요 없음. 자동 형변환을 해주기 때문에..
		
		if(p2 instanceof Parent) {
			System.out.println("p2는 Parent");			
		}
		
		if(p2 instanceof Child) {
			System.out.println("p2는 child");
		}
		
	}
}

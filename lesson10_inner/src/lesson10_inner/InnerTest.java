package lesson10_inner;

public class InnerTest {
//	int i;
	public static void main(String[] args) {
//		System.out.println(i);//초기화 시점과
		Outer outer = new Outer();
		Outer.Inner inner = new Outer().new Inner();
		Outer.SInner sInner = new Outer.SInner(); // 클래스 이름으로 직접 접근시켜야 함.
	}
}
class Outer{
	int i;
	static int si;
	class Inner{
		// 클래스 선언
		int i2;
		static int si2;
		{
			System.out.println(i); // 이친구는 아무짝에도 문제가 없지~요
			System.out.println(si);
		}
		
	}
	static class SInner{
		static int i3;
		int si3;
		{
			System.out.println(i); // i 변수는 클래스 변수가 메모리가 로드되면서 한번에 로드되기 때문에, 
		}
		
	}
}


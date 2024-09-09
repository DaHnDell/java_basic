package day2;
// 싱글톤은 인스턴스의 생성의 제한, 반대의 개념은 프로토타입이 있다.
public class Singleton {
	// 인스턴스가 필요할 때마다 요청하게 하고, 이때 이미 만들어져 있던 객체를 반환하는 형식으로 진행해야 함.
	private static Singleton singleton = new Singleton();
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		return singleton;
	}
}

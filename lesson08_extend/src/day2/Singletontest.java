package day2;

public class Singletontest {
	
//	final 키워드는 클래스, 메서드, 필드, 변수 모두에 올 수 있다. (마지막) 이라는 뜻.. 클래스 : 이 클래스에 대한 상속은 여기까지 입니다. 해당 클래스를 더이상 상속할 수 없습니다. String 클래스.
//	보통 클래스가 완벽하게 구현되었을 때 더이상 상속하지 않겠다는 의미로 사용. 메서드에 사용할 경우 더이상의 오버라이드를 금지한다는 의미(자주 사용하지는 않는듯)
//	추상의 경우 오버라이드를 무조건 해야 하기 때문에 파이널 사용 불가.
	public static void main(String[] args) {
//		Singleton singleton = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		String str;
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// 구매, 관리에 있어서 회원(배열) , 책, 관계 클래스 구매
	}
}

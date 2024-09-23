package lesson15_lambda;

import java.util.function.Function;

public class LambdaEx {
	public static void main(String[] args) {

		MyInter<Integer> inter = t -> t * t;

		// 인터페이스로 객체가 만들어지지 않을때에는 당연히 추상 메서드 때문이고~
		// 사실 파라미터의 타입 정도는 써도 되긴 함. 파라미터가 두개일때, 하나 쓰면 무조건 하나 써야하고, 하나 안쓸거면 둘다 안써야함.
		// 서술문이 하나일 경우에도 스코프{} 생략가능하고 리턴키워드 생략가능.
		// 파라미터가 하나일 때 괄호 생략 가능.
		// 제네릭이면 제네릭으로 뭔지 알 수 있기 때문에 인티저 타입 생략 가능. 그에 따라서 반환 타입도 필요 없음. 접근제한자도 필요 없음.
		// 인터페이스의 메서드는 모두 퍼블릭이므로.

		System.out.println(inter.m(10));
		// 어차피 이 메서드인걸 확실하게 알기 때문에..

		MyInter<String> inter2 = s -> "hello !@!!!!!!!!!!!!!!!" + s;
		System.out.println(inter2.m("새똥이"));

		// 람다 자체만으로 간결하고 훌륭하지만 제네릭을 사용할 경우에 더욱 더 간결하게 사용 가능.

		Function<String, Integer> f = s2 -> Integer.parseInt(s2);
//		Function<String, Integer> f2 = Integer::parseInt; // 메서드 참조
		// 파라미터 타입, 리턴 타입
		// 한 개 입력, 한개 출력은 같지만,

		int result = f.apply("1234"); // f 라는 펑션 타입의 함수에 값을 1234로 할게~~
		System.out.println(result + 1000); // 오케이 결과값에 넣어서 더한값 출력
		
		
		Object o = new MyInter<Integer>() {
// 		오브젝트 타입의 변수는 다형성으로 받을 수 있음.
			@Override
			public Integer m(Integer t) {
				return t;
			}
			
			
		};
		Object o2 = (MyInter<String>)s -> s;
		// 람다식은 오브젝트와 같은 상속관계와는 상관이 없음. 
		// 만약 위부분이 가능하게 되려면 특정 인터페이스 타입으로 식을 캐스팅해야 함.
		// 그러니까 식 그 자체로는 객체가 될 수 없음. 적어도 어느 객체에 담기거나, 
		// 왜냐하면 람다식은 타입을 추론할 수 있는 최소한의 근거가 있어야 함.
	}
}

@FunctionalInterface // 함수형 인터페이스 어노테이션 선언, 그러니까 람다식 전용 인터페이스
interface MyInter<T> {
	T m(T t);

	default T m2(T t) {
		return t;
	};
	// 단 하나의 추상 메서드만을 가진 인터페이스를 대상으로만 람다식을 사용 가능하다.
	// 위처럼 구현 메서드가 있을 경우에 문제는 없음. 추상 메서드는 단 하나여만야 함.
}

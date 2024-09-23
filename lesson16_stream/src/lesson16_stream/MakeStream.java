package lesson16_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class MakeStream {
	public static void main(String[] args) {
		String[] strs = {"가", "나" , "다" , "라"};
		Stream<String> stream = Arrays.stream(strs);
		stream.forEach(System.out::println); // 더블콜론을 이용하여 참조를 의미함. 
		stream = Arrays.stream(strs);
		stream.forEach(System.out::println); // 더블콜론을 이용하여 참조를 의미함.
		// 스트림은 한번 사용하면 끝. 이터레이터의 개념과 거진 동일함.
		// 다시 사용하려면 한번 더 선언해줘야함. 스트림의 방향은 단방향이라는 것을 기억하자.
		// stream(strs, 1, 3); = > 원래 있던 배열의 1번 이상 3번 미만의 인덱스만을 가지고 출력한다는 뜻.
		System.out.println("==============================");
		
		List<String> list = new ArrayList<String>(Arrays.asList(strs));
		stream = list.parallelStream();
		stream.forEach(System.out::println); // 더블콜론을 이용하여 참조를 의미함.

		// 셋으로 스트림 만들기
		stream = new HashSet<>(list).stream();
		System.out.println("==============================");
		stream.forEach(System.out::println);
		
		// 빌더 패턴으로 스트림 만들기
		stream = Stream.builder()
						.add("새똥이")
						.add("길동이")
						.add("소똥이")
						.build()
						.map(o->o.toString());
		stream.forEach(System.out::println);		
		
		//generate 사용으로 스트림 만들기
		stream = Stream.generate(()-> "Country Love Song").limit(10);
		stream.forEach(System.out::println); // 스트림은 무한루프임. 사용에 있어서 조심해야 함. 리미트 메서드를 이용하면 일정 정수값만큼 반복.
		
		// iterate 사용으로 스트림 만들기
		stream = Stream.iterate("A", t -> (char)(t.charAt(0)+1)+" ").limit(26);
		stream.forEach(System.out::println); // 스트림은 무한루프임. 사용에 있어서 조심해야 함.
		
		// of 사용으로 스트림 만들기 // 어떤 자료구조가 있다고 했을 때 스트림. 형식에 넣거나. 
		// 제네레이트로 만들거나..
		stream = Stream.of("가", "길동이", "새똥이");
		stream.forEach(System.out::println); // 스트림은 무한루프임. 사용에 있어서 조심해야 함.
		
		
		// 메소드 참조는 말 그대로 실행하려는 메소드를 참조해서 매개 변수의 정보 및 리턴 타입을 알아내고 
		// 람다식에서 굳이 선언이 불필요한 부분을 생략하는 것을 의미한다.
		
		IntBinaryOperator ibo = Math::max; // 메서드 참조의 예시. 메서드는 클래스든 인스턴스든 상관이 없다. 
		// 파라미터에 대한 값에 그대로 사용을 한다고 했을 때 무조건 가능.
		
		Function<String, Integer> f = Integer::parseInt;
		// 이름 고민하지말고 이렇게 써~ 하는 굉장히 편리한 방식임.
		// 타입에 대한 추론이 되어야 하는데, 이때 추론의 기초는 대부분 제네릭임.
		// 메서드 참조 시 파라미터는 절대로 언급해선 안된다.
//		BinaryOperator<String> bo = (x, y) -> x.concat(y);
		BinaryOperator<String> bo = String::concat; // 인스턴스 메서드인데 클래스 메서드로 호출
		System.out.println("a".concat("b"));
		
//		Function<String, Exception> f2 = s -> new Exception(s);
		Function<String, Exception> f2 = Exception::new;
		
		// boxed = > 일반 클래스와 래퍼 클래스 사이에 변환을 지원하는 메서드
		

		
	}
}

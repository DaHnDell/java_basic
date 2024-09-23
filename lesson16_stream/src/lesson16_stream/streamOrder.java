package lesson16_stream;

import java.lang.classfile.ClassFile.Option;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class streamOrder {
	public static void main(String[] args) {
		// 스트림 생성, 연산 Stream.of
		// 중간연산 => 중간연산은 계속해서 무언가를 할 수 있다는 것(필터, 맵, 정렬, peek)
		// 최종연산 => 대신 최종연산은 한번 하고나면 아무것도 못한다는 것. forEach, allMatch, anyMatch
		
//		Stream.of("홍길동", "김유신", "이순신", "유관순").sorted().forEach(System.out::println);
//		long cnt =
		boolean result = 
				Stream
				.of("홍길동", "김유신", "이순신", "유관순")
				.sorted(Comparator.reverseOrder())
				.filter(s->!s.startsWith("김"))
				.peek(System.out::println) // forEach와 동일한 연산이지만, 무조건 최종연산이 있어야만 작동함.
//				.allMatch(s->s.startsWith("홍")) // 이순신이었을때 조건을 만족하지 않기 때문에 반복을 종료해버리는 것.
				.anyMatch(s->s.startsWith("홍")); // 이순신이었을때 조건을 만족하지 않기 때문에 반복을 종료해버리는 것.
				// 즉 
//				.count();
//				.forEach(System.out::println);
		System.out.println(result);
		// 별도의 컴퍼레이터 조건을 sorted 메서드 괄호 안에 삽입 가능
		
		
		
//		Optional<String> optional = Optional.of("가");
		
//		System.out.println(optional.get());
		// .get = 실제 요소값을 그대로 출력
		// 스프링 프레임워크에서 어떤 객체의혹은 개체의 기본값 표현을 할때 아주 편리해서 자주 사용될 예정!
		
		String str ="가";
		Optional<String> optional = Optional.ofNullable(str); //널포인트엑셉션이 아래 출력부가 아닌 이곳에서 발생
		System.out.println(optional.isPresent()); // .isPresent = 불린
		System.out.println(optional.orElse("대체문자")); // .orElse null 일때 대체문자를 활용.
		
		// System.out.println(optional.ifPresent(null)); // ifPresent 는 반환타입이 void라서 컨슈머 타입임.  
		// 즉 값이 있다면~~어쩌고 저쩌고가 여기서 나옴. orElse
		
//		String str = "가";
		
		
		
	}
}

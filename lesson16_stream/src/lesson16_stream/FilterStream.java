package lesson16_stream;

import java.util.stream.Stream;

public class FilterStream {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("홍길동", "김유신", "이순신", "홍길동", "김유신", "이순신", "홍길동", "김유신", "유관순");
		// 스트림 인스턴스 생성
		// 스트림 가공하기
		stream
//				.distinct() // 중복 제거이자 중간 연산.
				.filter(s -> s.startsWith("홍")) // 그야말로 필터를 걸어주는 중간 연산.
				.forEach(System.out::println); // 최종연산
	}
}

package lesson16_stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStream {
	public static void main(String[] args) {
		IntStream is =(IntStream.rangeClosed(1, 5));
		
		
		List<Integer> list = IntStream.rangeClosed(1, 45).mapToObj(s -> s).collect(Collectors.toList());
		Collections.shuffle(list);
		System.out.println(list.subList(0, 6));
		
		is.forEach(System.out::println);
		
		LongStream ls = new Random().longs(6, 1, 45).sorted();
		
		is = "가나다라ABCD".chars(); // 문자열이 인트스트림이 되는 것.
		is.forEach(s -> System.out.println((char)s));
		ls.forEach(System.out::println);
		// 롱스트림을 이용해서 롱스 메서드
//		Comparator<String> com = (o1, o2) -> o1.compareTo(o2);
		Comparator<String> com = String::compareTo;
		
	}
}

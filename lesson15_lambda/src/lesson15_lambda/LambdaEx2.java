package lesson15_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.ObjLongConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		// 내부에 있는 숫자들을 한 줄에 하나씩 출력할 것
		list.forEach(i -> System.out.println(i)); // println은 보이드타입임으로 리턴타입도 없음. 즉 이 식은 컨슈머.
//		list.removeIf((i -> i <= 20)); // i가 20보다 작으면~ 제거할게요.
//		System.out.println(list);
		list.replaceAll(s -> s + 30);
		// unary = 1이라는 뜻. 즉 unaryop 는 함수와 같은 뜻. 위와 같이 하나의 연산자를 수행하는 경우에 사용 가능. Bi같은 경우도
		// 동일함.
		System.out.println(list);

		DoubleConsumer dc = d -> System.out.println(d * d); // 컨슈머는 절대 무언가를 반환하면안댐!
		dc.accept(10);

		ObjLongConsumer<String> olc = (s, l) -> System.out.println("문자열 : " + s + "롱타입 : " + l);
		olc.accept("새똥이", 9l);
		
		
		List<String> list2 = Stream.of(5, 4, 3, 2, 1).map(s->s+" ").distinct().collect(Collectors.toList());
		// 이런식으로 할 경우 당연히 인티저 스트림(정수 스트림) 이 됨. 
		// distinct = 중복제거	} // to list = list2
		// 람다는 추론, 결국 어떤 식으로든 구현이 가능
		System.out.println(list2);
	}
}
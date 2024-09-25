package lesson12_api;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class ArraysEx {
	public static void main(String[] args) {
		String[] arr = {"홍", "이", "강", "김"};
		Arrays.sort(arr, (o1, o2) -> -o1.compareTo(o2) ); // 정렬에 있어서는 당연히도 기준이 중요한데. Comparable 인터페이스나 
		System.out.println(Arrays.toString(arr));
		
		BiFunction<String, String, Integer> bi = (o1, o2) -> -o1.compareTo(o2);
		
		int[] arr2 = new int[10];
		Arrays.fill(arr2, 5);
		
		System.out.println(Arrays.toString(arr2));
		
//		어떤 참조자료형 뒤에 s를 붙여 사용하는 경우가 굉장히 많다
		
		Arrays.fill(arr2,  new Random().nextInt(6)+1);
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = IntStream.range(1, 6).limit(5).toArray();
		System.out.println(Arrays.toString(arr3));
		
		// 수정본
	}
}

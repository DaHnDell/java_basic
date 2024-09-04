package lesson06_array;

import java.util.Arrays;

public class Arrayinfo02 {
	public static void main(String[] args) {
		int[] arr = {10, 5, 3, 8, 4};
		arr = new int[10]; // 기존에 있던 배열의 값들은 모두 사라짐(덮어쓰기 느낌)
		arr = new int[]{1, 2, 3};
		System.out.println(arr.length);
		char[] cArr = {'A', 'B', '가', '나'};
		String[] str = {"AB", "가나"};
		
		Arrays.toString(arr);
		
		System.out.println(Arrays.toString(arr)); //해쉬값(주소값)
		System.out.println(cArr); //문자 배열일 경우에만 그대로 값을 확인이 가능하다.
		System.out.println(Arrays.toString(str)); //문자 배열일 경우에만 그대로 값을 확인이 가능하다.
		
	}
}

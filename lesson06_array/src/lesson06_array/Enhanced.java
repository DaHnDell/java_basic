package lesson06_array;

public class Enhanced {
	public static void main(String[] args) {
		int[] arr = {10, 15, 5, 20, 30};
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		// 향상된 for문
		// 1. index 없음
		// 2. 읽기 전용(지역 내에서나 확인 가능)
		
		// for(type : 배열)
		
		for(int num : arr) {
			num = 100;
			System.out.print(num + " ");
		}
		String[] strs = {"더좋은", "아카데미", "자바", "데이터베이스"};
		for(String str : strs) {
			System.out.print(str);
		}
	}
}

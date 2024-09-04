package lesson06_array;

public class ArrayInfo {
	public static void main(String[] args) {
		// 배열 : 하나의 변수로 여러 데이터를 저장
		// 타입[] 변수명; // 타입 변수명[]; // 배열 선언
		int num;
		int[] arr;
		double[] arr2;
		String[] strings;
		
		// 배열의 초기화 : 
		// 기본값 0 flase null
		// 배열의 기본값도 null로 초기화하는것이 좋다.
		// 초기화를 했을 경우 당연히 출력이 가능하다.
		// 배열의 사용법도 C와 동일하므로 배열을 사용하려면 
		// 사용의 범위 역시도 초기화해줘야함(선언)
		
		
		int[] arr3;
		arr3 = new int[5]; // int의 기본값인 0으로 초기화됨.
		// arr[0] arr[1] arr[2] arr[3] arr[4]
		
//		System.out.println(arr3[0]);
//		System.out.println(arr3[1]);
//		System.out.println(arr3[2]);
//		System.out.println(arr3[3]);
//		System.out.println(arr3[4]);// 인덱스 값이 반복적인 for 문을 사용하기 매우 알맞게 되어 있음
//		System.out.println(arr3[5]);
		
		arr3[0] = 10;
		arr3[1] = 20;
		arr3[2] = 50;
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println(arr3[i]);
		}
		String[] strs = {"홍씨", "이씨", "김씨"};
		for(int i = 0; i <strs.length; i++) {
			System.out.println(strs[i]);
		}
		
	}
}

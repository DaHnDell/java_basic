package hw0904;

import java.util.Arrays;

public class Homework {
	public static void main(String[] args) {
		// 버블 정렬 
		// for 문으로 i = length 넣고 i-- 
		
		int[] arr = {1, 2, 3, 4, 5 ,6, 7, 8, 9, 10};
		
		System.out.println("초기 :: " + Arrays.toString(arr));
		// 회차 반복
		point:for(int i = 0; i < arr.length ; i++) {
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] <= arr[j+1]) {
					// 값 비교 후 자리 교환
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
			System.out.println("회차 :: " + Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
		// 비교 반복
		
 
		
	}
}

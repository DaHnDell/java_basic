package lesson06_array;

import java.util.Arrays;

public class ArrEx10 {
	public static void main(String[] args) {
		int[] arr = {5, 10, 20, 7, 3, 6};
		int[] tmp = new int[6];
		int sumOfTmp = 0;
		double avgOfTmp = 0.0;
		// 해당 배열의 최대값을 구해서 출력합니다.
//		for(int i = 0; i < arr.length; i++) {
//			if (arr[i] > arr[i+1]) {
//				tmp[i] = arr[i+1];
//			}
//			if(i == arr.length) {
//				arr[i] > arr[i-1] ? tmp[i] = arr[i-1] : System.out.println();;
//			}
//		}
//		for (int i = arr.length; i >= 0; i--) {
//		for (int i = 0; i < arr.length -1; i ++) {
//				tmp[i] = arr[i];
//			}
//		if (tmp[i]== )
//		
//		System.out.println(Arrays.toString(arr));
//		
		for(int i = 0; i< arr.length; i++) {
			tmp[i] = arr[i];
			sumOfTmp += (int)(tmp[i]);
		}
		avgOfTmp = sumOfTmp /(double)arr.length;
		System.out.println(sumOfTmp); // 합계계산
		System.out.println(avgOfTmp); // 합계계산
		
		int max = arr[0]; // 필연적으로 있어야 하는 값을 기준으로 초기화하는 습관을 가지자.
		int min = arr[0];
		for (int i = 1; i < arr.length-1; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			else if(min > arr[i]) {
				min = arr[i];
			}
			System.out.println(max);
			System.out.println(min);
		}		
	}
}

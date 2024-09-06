package hw0905;

import java.util.Arrays;

public class SelectionSort {
//	public static void main(String[] args) {
//		int tmp;
//		int min = 0;
//		int[] arr = new int [10];
//		for (int i =0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*50)+1;
//		}
//		System.out.println(Arrays.toString(arr));
//		int mini = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(i+1+":회차");
//			for (int j = i; j< arr.length; j++) {
//				if(mini > arr[j]) {
//					min = j;
//					mini = arr[j];
//				}
//			}
//			mini = 51;
//			tmp = arr[i];
//			arr[i] = arr[min];
//			arr[min] = tmp;
//			System.out.println(Arrays.toString(arr));
//		}
	
	
	//  최솟값의 위치(인덱스) 찾기
	public static void main(String[] args) {
//		String str = "123456";
//		System.out.println(str.indexOf("3"));
//		
//		char[] cs = str.toCharArray();
//		
//		
//		int idx = -1;
//		for(int i=0;i<cs.length; i++) {
//			if(cs[i]=='3') {
//				idx = i;
//				break;
//			}
//		}
		
		int[] arr = {5, 4, 7, 6, 1};
		System.out.println(arr[-1]);
		for(int i = 0; i < arr.length; i++) {
			int idx = i;
			for(int j = 0; j < arr.length; j++) {
				if(arr[idx] > arr[j]) {
					idx = j;
				}
			}
			System.out.println(idx);
			int tmp =  arr[idx];//{5, 4, 2, 1, 7};
			arr[idx] = arr[i];//{1, 4, 2, 1, 7};
			arr[i] = tmp;
			System.out.println(Arrays.toString(arr));
		}
	}
	
}

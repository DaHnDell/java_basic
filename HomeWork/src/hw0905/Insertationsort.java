package hw0905;

import java.util.Arrays;

public class Insertationsort {
	public static void main(String[] args) {
		
//		int[] arr = {8, 6, 5, 2, 4};
//		int tmp = 0;
//		int count = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = i; j<arr.length; j++) {
//				if(arr[j]<arr[i]) {
//					tmp = arr[i];
//					for(int l = i; l == count; l--) {
////						if (i != 1) {
////							arr[l] = arr[l+1];
////							arr[1+1]=tmp;
////							tmp = arr[l];
////						}
//						
//						System.out.println(arr[l]+","+arr[l+1]);
//						System.out.println(Arrays.toString(arr));
//					}
//					count ++;
//					System.out.println(arr[j]+","+arr[i]);
//					arr[i] = arr[j];
//					arr[j] = tmp;
//					System.out.println();
//				}
//				System.out.println(Arrays.toString(arr));
//			}
//			System.out.println("11111111");
////			do
////			{
////				int j = i+1;
////				if(arr[j] < arr[i]) {
////					tmp = arr[i];
////				} j++;
////			}while(<arr.length);
//		}
		
		int[] arr = {3, 5, 4, 1, 2};
		
		
		for(int j = 1; j < arr.length; j++) {
			System.out.println(j+ ": 회차");
			for(int i = j; i > 0; i--) {
				if(arr[i] < arr[i-1]) {
					int tmp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = tmp;
				}
				System.out.println(Arrays.toString(arr));
			}
		}
	}
}

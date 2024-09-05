package hw0905;

import java.util.Arrays;

public class TruobleBubble {
	public static void main(String[] args) {
		int tmp = 0;
		int ins = 0;
//		int[] arr = new int[10];
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*50)+1;
//		}
		int[] arr = {8, 5, 6, 2, 4};
		
		System.out.println(Arrays.toString(arr));

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < i+2 ; j++) {
				System.out.print(i + ", "+ j );
				if(arr[j]<arr[i]) {
					ins = arr[j];
					tmp = arr[i];
					arr[i] = ins;
					arr[j] = tmp;
					for (j = i; j == 0; j--) {
						tmp = arr[i];
						arr[j] = tmp;
					}
				}
				System.out.println(Arrays.toString(arr));

				//				
//				else {
//					
//				}
//				System.out.print(i + ", "+ j );
//				System.out.println(Arrays.toString(arr));
			}

//			System.out.println(Arrays.toString(arr));
			System.out.println("==========");
		}
		
	}
}

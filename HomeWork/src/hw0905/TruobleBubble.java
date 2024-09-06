package hw0905;

import java.util.Arrays;

public class TruobleBubble {
	public static void main(String[] args) {
		int tmp = 0;
//		int ins = 0;
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
			for(int j = 0; j < i ; j++) {
				System.out.print(i + ", "+ j );
				if(arr[j]<arr[i]) {
					tmp = arr[i];
//					arr[i] = ins;
					for (int l = i; l > j; l--) {
//						tmp = arr[i];
						arr[l] = arr[l-j];
					}
					arr[j] = tmp;
					break;
				}
				System.out.println(Arrays.toString(arr));

				//				
//				else {
//					
//				}
//				System.out.print(i + ", "+ j );
//				System.out.println(Arrays.toString(arr));
			}

			
			System.out.println("==========");
			System.out.println(Arrays.toString(arr));
		}
		System.out.println(Arrays.toString(arr));
	}
}

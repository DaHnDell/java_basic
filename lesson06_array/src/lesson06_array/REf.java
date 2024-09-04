package lesson06_array;

public class REf {
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9};
		
		
		arr[0] = 10;
//		System.out.println(arr2[0]); // 어째써???!?!?!?!?!?!?!?!?!?!?!?
//		arr = null;
//		arr2 = null; // 연결을 해제
//		
		int[] arr2 = new int[arr.length *2];
		
		for(int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		
		int a = 10;
		int b = a;
		
		a = 20;
		System.out.println(b);
		System.out.println(022);
		System.out.println(0x22);
		
		
		
	}
}

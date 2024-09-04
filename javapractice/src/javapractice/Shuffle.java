package javapractice;

import java.util.Arrays;

public class Shuffle {
	public static void main(String[] args) {
		int[] arr = new int[45];
		// 내부값 초기화 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int rand = (int)(Math.random()*arr.length);
			int tmp = arr[i];
			arr[i] = arr[rand];
			arr[rand] = tmp;
		}
		int[] lotto = new int[6];
		for(int i = 0; i< lotto.length; i++) {
			lotto[i] = arr[i];
		}
		System.out.println(Arrays.toString(lotto));
		
	}
}

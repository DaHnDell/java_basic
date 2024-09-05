package hw0905;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int tmp;
		int min = 0;
		int[] arr = new int [10];
		for (int i =0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*50)+1;
		}
		System.out.println(Arrays.toString(arr));
		int mini = arr[0];
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1+":회차");
			for (int j = i; j< arr.length; j++) {
				if(mini > arr[j]) {
					min = j;
					mini = arr[j];
				}
			}
			mini = 51;
			tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
			System.out.println(Arrays.toString(arr));
		}
	}
}
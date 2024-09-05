package lesson07_oop;

import java.util.Arrays;

public class MyQueue {

	private int[] items = new int[3]; 
	private int cnt;
	private int minusPoint;
	
	
	int popQueue (){
		minusPoint ++;
		System.arraycopy(items, cnt, items, minusPoint, cnt-minusPoint);
		System.out.println(Arrays.toString(items));
		return 0;
		}
	
	void pushQueue(int item) {
		if (cnt == items.length) {
			System.out.println("크기 늘리기");
			items = Arrays.copyOf(items, items.length*2);
		}
		items[cnt++] = item;
	}
	
	int size() {
		 System.out.println(Arrays.toString(items));
		return cnt;
	}
	
}

package lesson07_oop;

import java.util.Arrays;

public class MyStack {
	
	private int[] items = new int[3]; 
	private int cnt;
	
	
	int pop (){
		return items[--cnt];//큐로 구현할 때 에는 옮겨줘야 함 
		}
	
	void push(int item) {
		if (cnt == items.length) {
			items = Arrays.copyOf(items, items.length*2);
		}
		items[cnt++] = item;
	}
	
	int size() {
		 System.out.println(Arrays.toString(items));
		return cnt;
	}
}

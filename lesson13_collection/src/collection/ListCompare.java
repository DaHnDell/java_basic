package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> link = new LinkedList<Integer>();
		
		System.out.println("inc");
		System.out.println("inc");
		inc(arr);
		inc(link);
		
//		System.out.println("access");
//		access(arr);
//		access(list);
		
		System.out.println("inc2");
		incre2(arr);
		incre2(link);

		System.out.println("remove");
		rem(arr);
		rem(link);

		System.out.println("remove");
		rem2(arr);
		rem2(link);
		
	}
	static void inc(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1_000_000; i++) {
			list.add(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}
	
	static void access(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 1_00_000; i++) {
			list.get(i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}
	
	static void incre2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			list.add(0, i);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}
	
	static void rem(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < 10_000; i++) {
			list.remove(0);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}

	static void rem2(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 100_000; i > 0 ; i--) {
			list.remove(i-1);
		}
		System.out.println(list.getClass().getSimpleName() + " :: " + (System.currentTimeMillis() - start + "ms"));
	}
	
	
}

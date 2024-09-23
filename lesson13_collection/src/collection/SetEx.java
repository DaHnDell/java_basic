package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("가");
		set.add("나");
		set.add("다");
		set.add("라");
		
		set.add("가");  // 중복 여부, add 메서드가 불린 타입인 데에는 이러한 이유가 있는 것! 
		// 값이 중복일 경우에 false 중복이 아닐 경우 true
		System.out.println(set);
		
		System.out.println(set.add("가"));
		System.out.println(set.add("라"));
	}
}

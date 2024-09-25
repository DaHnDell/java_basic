package lesson12_api;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("b[a|A]+");
		
		Matcher m; 
		
		m = p.matcher("bat");
		System.out.println("bat = " + m.matches());
		// 비교연산자의 값은 matches() 인스턴스에 들어간다. 여기서 확인 가능.
		m = p.matcher("cat");
		System.out.println("cat = " + m.matches());

		m = p.matcher("bed");
		System.out.println("bed = " + m.matches());

		m = p.matcher("b");
		System.out.println("b = " + m.matches());
		
		
		boolean ab = "bat".matches("b[a-z]*");
		
		System.out.println(ab);
		
		int[] arr = new int[5];
		arr[0] = 1;
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		System.out.println(list);
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		
	}
}

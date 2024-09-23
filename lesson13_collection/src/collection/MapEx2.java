package collection;

import java.util.Map;
import java.util.TreeMap;

public class MapEx2 {
	public static void main(String[] args) {
		// 글자 빈도수 구하기이이이
		String str = "AAAAAAABFDESDESAKJHSDUIQWB";
		
		// 목표
		// {A = 6,,,,}
		
		Map<String, Integer> map = new TreeMap<>();
		
		String[] strs = str.split("");
//		for(int i = 0; i < str.length(); i++) {
//			
//		}
		for(String s : strs) {
			map.put(s, map.containsKey(s) ? map.get(s) + 1 : 1); // 해당 값을 가지고 있는가? 가지고 있다면 1을 더하고, 가지고 있지 않다면 1을 반환하고 값을 기록!
		}
		System.out.println(map);
//		
//		map.put(str.charAt(0)+"", 1);
//		
//		map.put(str.charAt(1)+"", map.get("A")+1);
	}
}

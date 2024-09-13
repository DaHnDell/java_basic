package lesson12_api;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str = "abcdeabcde";
//		System.out.println(str.charAt(100));
		
		System.out.println(str.equals(new String("abcdeabcde")));
		System.out.println(str.indexOf("b"));
		System.out.println(str.indexOf("b", 3));
		System.out.println(str.lastIndexOf("b", 3));
		System.out.println(str.lastIndexOf("b"));
		
		// substring
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 7));
	
		// 첫번째 만나는 c 문자열 에서부터 , 마지막 만나는 d 문자열까지 문자열 자르기 
		
		System.out.println(str.substring(str.indexOf("c"), str.lastIndexOf("d")));
		System.out.println(str.toUpperCase().toLowerCase());
		
		
		String s = "      [   안녕하세요   ]     ";
		System.out.println(s.trim().replaceAll(" ",""));
		
		System.out.println(str.endsWith("de"));
		System.out.println(str.endsWith("cd"));
		System.out.println(str.indexOf("cd")); // 시작위치, 앞자리 값을 반환한다. 정확하게 동일해야 함.
		
		System.out.println(str.replace("a","f")); // 정규식의 대부분은 자바스크립트에서 사용한다.
		
		System.out.println(Arrays.toString(str.split("")));
		System.out.println(Arrays.toString(str.split("b"+ "")));
		System.out.println("abc".compareTo("a가d")); // 정렬에 따른 차순		
		System.out.println("abc".compareTo("aae")); // 정렬에 따른 차순, 음수 혹은 양수에 따른 판단도 가능. 문자열은 사전에 compare To로 인해 정렬이 되어져 있다.
	}
}

package lesson12_api;

public class Wrapper {
	

	
	public static void main(String[] args) {

//		Integer i1 = 10;
//		Integer i2 = new Integer(20); // boxing
//		Integer i3 = new Integer("30"); // boxing
//		System.out.println(i1 + i2 + i3); // unboxing
//		
//		Integer i4 = 20;
//		
//		System.out.println(i2.equals(i4));
////		i2.intValue() == i4.intValue();
//		
////		Long l1 =
//		
//		Long l1 = 10L;
//		Long l2 = 10L;
//		
//		Character c1 = 65;
//		
//		// 문자열 > wrapper 객체
//		l2 = Long.valueOf("10");
////		l2 = new Long("10");
//		
//		// wrapper > 문자열
//		String str = l2.toString(); // l2가 null인 경우 nullpoint 예외 발생
//		str = l2 + " ";
//		// 기본형 > wrapper
//		l2 = Long.valueOf(10L);
		// wrapper > 기본형
//		long l3 = l2.longValue(); // 사실 뒤에 취소해도 되는데, 혹시 안되는 경우에 사용 가능
		
		// 기본형 > 문자열
//		str = String.valueOf(l3);
//		
//		// 문자열 > 기본형		
//		l3 = Long.parseLong(str); // 자료형에 따른 모든 parse 있음.
//		
//		double d = Double.parseDouble(str);
//		
//		Integer.parseInt(str, 0);
		
		int[] arr;
		
		Integer.parseInt("FF", 16);
		
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toOctalString(255));
		System.out.println(Integer.toHexString(255));
		
		int i = 0xFF;
		char ch = '가'; // 이걸 또
		char ch2 = 0xAC00; // 이걸 또
		char ch3 = '\uAC00'; // 이걸 또
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		
	}
	
}

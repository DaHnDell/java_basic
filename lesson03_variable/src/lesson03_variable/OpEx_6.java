package lesson03_variable;

public class OpEx_6 {
	public static void main(String[] args) {
		String s1 = Integer.toBinaryString(10); // 변수를 넣거나 실제 정수갑 리터럴을 넣어도 됨. 
		System.out.println(s1);
		String s2 = Integer.toBinaryString(6); // 변수를 넣거나 실제 정수갑 리터럴을 넣어도 됨.
		System.out.println(s2);
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		System.out.println(max + ", " + min);
		
		System.out.printf("%032d", Integer.parseInt(s2));
		System.out.println("0" + Integer.toBinaryString(max));
		System.out.println("0" + Integer.toBinaryString(min));
		
		System.out.println(max + 1);
		
		// Integer.parseInt(String) : int;
	}
}

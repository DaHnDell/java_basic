package lesson_01_install;

public class HelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
/*		for (int i = 2; i <= 9; i++){
			for (int j = 1; j <= 9; j++) {
			System.out.printf("%2d*%2d = %2d", i, j, i*j);
			System.out.println();
*/			
		int num = 100;
		System.out.println(num+30);
		System.out.println(num-30);
		System.out.println(num*30);
		System.out.println(num/30);
		System.out.println(num%30);
		
		System.out.println();
		System.out.println(num>30);
		System.out.println(num<=30);
		System.out.println(num==30);
		
		char ch = '가';
		System.out.println(ch);
		System.out.println(++ch);
		
		float f = 3.f;
		double d = 3.0;
		
		long l = 30L;
		
		byte b = 10;
		short s = 20;
		boolean bool = true;
		
	}

}

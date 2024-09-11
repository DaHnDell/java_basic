package lesson11_exeption;

public class ExceptionEx04 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
		System.out.println(2);
		System.out.println(4/0);
		System.out.println(args[0]);
		Integer.parseInt("a");
		}
		catch (ArithmeticException e) {
			System.out.println(5);
			e.printStackTrace();
			System.out.println(e.getClass().getName());
			System.err.println(e.getMessage());
			StackTraceElement[] elements = e.getStackTrace();
			for(StackTraceElement ste : elements) {
				System.out.println(ste.getMethodName());
			}
			
		}
		
		System.out.println(6);
//		new Ex
		// 예외는 누가 발생시키고 누가 전달하는가?ㅉ
		
	}
}

package lesson11_exeption;

public class ExceptionEx02 {
	public static void main(String[] args) {
		System.out.println(1);
		try {
		System.out.println(2);
		System.out.println(3/0);
		System.out.println(4);
		}
		catch (Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
		
	}
}

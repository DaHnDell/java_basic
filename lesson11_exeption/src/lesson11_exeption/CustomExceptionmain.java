package lesson11_exeption;

public class CustomExceptionmain {
	public static void main(String[] args) {
		int num = nextInt("국어");
		if(num < 0 || num > 100) {
			throw new RangeException(0, 100);
		}
	}
}

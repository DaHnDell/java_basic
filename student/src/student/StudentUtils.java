package student;

import java.util.Scanner;
import java.util.function.Predicate;

public class StudentUtils {
	static Scanner scanner = new Scanner(System.in);
	
	static String nextLine(String msg) {
		System.out.println(msg);
		System.out.print("> ");
		return scanner.nextLine();
	}
	static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	
	static <T> T next(String msg, Class<T> clazz) { // 인트 아니면 스트링 받을건데 딱히 안가릴게. 대신 Class 하나는 받을거야. 만약 인트받으면 인트, 스트링 받으면 스트링 리턴할거야.
		System.out.println(msg);
		System.out.print("> ");
		String str = scanner.nextLine();
		if (clazz == Integer.class) {
			return clazz.cast(Integer.parseInt(str)); // 해당클래스에 있는 리터럴로 캐스팅해주는 메소드 .cast()
		} else if (clazz == String.class) {
			return clazz.cast(str); // 어차피 스트링인데 str 하면 되는거 아닌가?  no! 제네릭 T에 따른 정확한 형식을 맞춰줘야 함.
		} else {
			throw new RuntimeException("잘못된 타입");
		}
	}
	
	/*
	 * () -> {} Runnable (1) -> {} Consumer () -> {1} Supplier (1) -> {1} Function
	 * (1) - > {b} Predicate
	 */

	// 입력 반복
	
	static <T> T next(String msg, Class<T> clazz, Predicate<T> con, String errMsg) {
		while (true) {
			try {
				T t = next(msg, clazz); // 받아온 메세지와 해당 클래스를 그대로 던져주고
				if (con.test(t)) { // 입력값을 잘 입력받아서 호출한 곳으로 점수를 잘 리턴한다는 조건
					return t; 
				} else { // 입력받을 잘 입력받지 못해서 혹은 다른 형식의 입력을 받았을 때 던져서 
					throw new IllegalArgumentException(errMsg);
				}
			}catch (NumberFormatException e) {
				System.out.println("올바른 숫자를 입력");
			}catch (IllegalArgumentException iae) { // 와일 문 내부에서 각각 내가 리턴받아야 해서 무조건 밖으로 나가서 받으면 안됨. 내가 받아야 함.
				System.out.println(iae.getMessage());
			}catch (RangeException e) {
				System.out.println("올바른 범위의 숫자를 입력");
			}
		}
	}
	
}
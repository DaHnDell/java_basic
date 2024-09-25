package lesson5_control;

public class WhileEx1 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while (i <= 100) {
			sum += i;
			i++;
			System.out.printf("i = %d, sum = %d\n", i, sum);
		}
		System.out.println(sum);
	}
}

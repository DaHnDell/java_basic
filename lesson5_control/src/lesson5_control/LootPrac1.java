package lesson5_control;

import java.util.Scanner;

public class LootPrac1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		String [] lotto = new String [6];
		String [] reallot = new String[6];
		String idx = " ";
		
		 
		
		for(int i = 0; i < 7; i++) {
			lotto[i] = scanner.toString();
			System.out.printf("%d 번 숫자 : %s", i, lotto[i]);
		}
		
	}
}

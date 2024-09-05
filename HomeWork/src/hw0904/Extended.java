package hw0904;

import java.util.Arrays;

public class Extended {
	public static void main(String[] args) {
		String[] temp = {"abc", "def"};
		temp = Arrays.copyOf(temp, temp.length*2);
		System.out.println(Arrays.toString(temp));
	}
}

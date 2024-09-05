package lesson07_oop;

public class Overloading {
	public static void main(String[] args) {
		new Operator().multiply(10, 20);
	}
}


class Operator{
	int multiply(int x, int y) {
		return x*y;
	}
	double multiply(double x, int y) {
		return x*y;
	}
	double multiply(int x, double y) {
		return x*y;
	}
}
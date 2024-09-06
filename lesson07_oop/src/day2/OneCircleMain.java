package day2;

public class OneCircleMain {
	public static void main(String[] args) {
//		OneCircle oneCircle = new OneCircle(10);
//		oneCircle.printRound().;
		new OneCircle()
		.setR(5)
		.printArea()
		.printRound()
		.setR(10)
		.printArea()
		.printRound();
	}
}

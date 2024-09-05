package lesson07_oop;

public class VarEx {
	public static void main(String[] args) {
		System.out.println("Avante 제조사 : " + Avante.company);
		
		Avante a1 = new Avante();
		Avante a2 = new Avante();
		
		a1.color = "White";
		a2.color = "Black";
		
		System.out.println("a1 colour : " + a1.color);
		System.out.println("a2 colour : " + a2.color);

		Avante.company = "Kia";
		
		System.out.println("Avante 제조사 : " + Avante.company);
		System.out.println("a1 company : " + a1.company);
		System.out.println("a2 company : " + a2.company);
	
		Avante.company = "Toyota";
		System.out.println("Avante 제조사 : " + Avante.company);
		System.out.println("a1 company : " + a1.company);
		System.out.println("a2 company : " + a2.company);

		boolean sameIf = (a1.company == "Kia");
		
	}
	
}


class Avante{
	String color;
	static String company = "Hyundai";
	
}
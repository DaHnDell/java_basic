package day2;

public class OneCircle {
	double r;
	
	public OneCircle() {}
		// TODO Auto-generated constructor sturct
	public OneCircle(double r) {
		setR(r);
		System.out.println(r);
	}
	
	OneCircle setR(double r) {
		return this;
	}
	
	OneCircle printRound() {
		System.out.println(Math.PI*r*2);
		return this;
	}
	
	OneCircle printArea() {
		System.out.println(Math.PI * r * r);
		return this;
	}
	
	OneCircle test() {
//		double r = 0;
		System.out.println(r);
		System.out.println(this.r);
		return this;
	}
	
}

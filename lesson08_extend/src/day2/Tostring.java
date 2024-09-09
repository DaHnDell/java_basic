package day2;

public class Tostring {
	public String toString() {
		return "재정의된 내용";
	}
	public void print() {
		System.out.println(super.toString());
		System.out.println(this.toString());
	}
	
	
	public static void main(String[] args) {
		
		Object object = new Object();
		System.out.println(object);
		System.out.println(object.toString());
		
		Tostring ts = new Tostring();
		
		System.out.println(ts);
		System.out.println(ts.toString());
	}
}

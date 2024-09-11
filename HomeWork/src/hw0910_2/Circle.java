package hw0910_2;

public class Circle extends Shape implements D2{
	
	private final int r; // final로 만들 경우 세터가 필요가 없음

	public Circle(int r) {
		super("원");
		this.r = r;
	}
	// 원
	@Override
	public double legnth() {
		// TODO Auto-generated method stub
		return 2*r*Math.PI;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return r*r*Math.PI;
	}
	
	
	
}

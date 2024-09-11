package hw0910_2;

public class Rect extends Shape implements D3{
	private int x;
	private int y;
	
	public Rect(int x, int y) {
		super("사각형");
		this.x = x;
		this.y = y;
	}
	
	public double Rect() {
		super();
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (x+y)*2;
	}
	
}

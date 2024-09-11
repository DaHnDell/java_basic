package hw0910_2;

public class Cylinder extends shape implements D3{
	private Circle circle;
	private int z;
	
	
	public Cylinder(int r, int z) {
		super("원기둥");
		circle = new Circle(r);
		this.z = z;
	}
	public Cylinder(Cricle circle, int z) {
		super("원기둥");
		this.circle = circle;
		this.z = z;
		
		
	}
	
	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return circle.area() * z;
	}
	
	public double area() {
		return circle.area()*2 + circle.legnth()*z;
	}
	
}

package hw0910;

public class ShapeCircle extends Shape{ // 원 클래스 
	// 원 둘레 넓이 // 위 4가지 구조물의 구상 클래스는 하나의 배열으로 인해 관리되어야 함
	private static double rad;
	private double length;
	private double area;
//	private double height;
//	private double volume;
	
	public ShapeCircle() {
		
	}
	
	@Override
	public String toString() {
		return "ShapeCircle [length=" + defLength() + ", area=" + defArea() + "]";
	}

	public ShapeCircle(double rad) {
		this.rad = rad;
	}
	public void setRad(double rad) {
		this.rad = rad;
	}

	public double defLength() {
		this.length = Math.PI*this.rad*2.0;
		return length;
	}
	public double defArea() {
//		System.out.println("원 넓이" + );
		this.area =  Math.PI*this.rad*this.rad;
		return area;
	}
	
//	
//	public void setHeight(double height) {
//		this.height = height;
//	}
//	
//	public double getHeight() {
//		return height;
//	}
//	
//	public void volume() {
//		area = defArea();
//		this.volume = area*getHeight();
//		if(height !=0) {
//			System.out.println(volume);
//		}
//	}

	
}




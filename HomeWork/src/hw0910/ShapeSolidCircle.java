package hw0910;

public class ShapeSolidCircle extends ShapeCircle implements SolidIf { // 원뿔 클래스 // 원의 값 상속
	// 원 사각형 둘레 넓이 // 원기둥 육면체 둘레 넓이 // 위 4가지 구조물의 구상 클래스는 하나의 배열으로 인해 관리되어야 함
//	double height;
	private double height;
//	ShapeSolidCircle shapeSolidCircle = new ShapeSolidCircle();
	private double volume;
	private double area;
//	private double rad;
	
	public ShapeSolidCircle(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "ShapeSolidCircle [height=" + getHeight() + ", volume=" + volume() + ", area=" + getArea() + "]";
	}

	public void setArea(double area) {
		area = super.defArea();
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return height * super.defLength() + super.defArea()*2;
	}
	
	@Override
	public double volume() {
		height = getHeight();
		this.volume = getArea()*height; // 절대 요행을 바라지 마. 리턴값을 넣으면 된다고 생각한 우매한 김함님.
		return volume;
	}

}




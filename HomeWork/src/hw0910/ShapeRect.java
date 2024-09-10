package hw0910;

public class ShapeRect extends Shape { // 사각형 클래스 
	// 사각형 둘레 넓이 // 구조물의 구상 클래스는 하나의 배열으로 인해 관리되어야 함
	int side1;
	int side2;
	public ShapeRect() {
	}
	
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public void printLength() {
		(side1+side2)*2
		System.out.println();
	}
	public void printArea() {
		System.out.println(side1*side2);
	}
	
	
}




package hw0910;



public class ShapeRect extends Shape {
    private int side1;
    private int side2;
//    private double height;
    public ShapeRect() {

    }
    public ShapeRect(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public String toString() {
        return "ShapeRect [length=" + defLength() + ", area=" + defArea() + "]";
    }
    
    public void setSide1(int side1) {
        this.side1 = side1;
    }
    
    public int getSide1() {
        return side1;
    }
    
    public void setSide2(int side2) {
        this.side2 = side2;
    }
    
    public int getSide2() {
        return side2;
    }

    public int defLength() {
        return (side1 + side2) * 2;
    }

    public int defArea() {
        return side1 * side2;
    }



//	public void setHeight(double height) {

//	this.height = height;

//}

}





package hw0910;

public class ShapeSolidRect extends ShapeRect implements SolidIf{
	private double height;
	private double volume;
	
//    public ShapeSolidRect(double height) {
////    	super(setSide1(), setSide2());
////    	super(getSide1(), getSide2()); ?!?!?!?!?!??? ..
////    	super(ShapeRect());
////    	super(side1, side2);
//    	super();
//        this.height = height;
//    }
    public ShapeSolidRect(int side1, int side2, double height) {
        super(side1, side2); 
        this.height = height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

//	public double defArea() {
//		    super(side1, side2);
//		    
//	}
    public double getArea() {
		return (height * super.getSide1() + height * super.getSide2() + super.defArea())*2;
	}

    

//	public void setArea(double area) {
//		area = super.defArea();
//	}



//    @Override

//    public double volume() {

//    	height = getHeight();

//    	this.volume = getArea()*height;

//        return volume;

//    }
    @Override
    public String toString() {
        return "ShapeSolidRect [side1=" + getSide1() + ", side2=" + getSide2() + ", area=" + defArea() + ", height=" + getHeight() + ", volume=" + volume() + "]";
    }
    @Override
    public double volume() {
        return defArea() * height; 
    }

}
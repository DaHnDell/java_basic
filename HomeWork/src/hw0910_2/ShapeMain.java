package hw0910_2;

public class ShapeMain {
	public static void main(String[] args) {
	
		Shape s1 = new Circle(5);
		
		System.out.println(s1.area());
//		System.out.println((((D2)s1).length())));
//		
//		Shape s2 = new Cylinder(10, 3);
		
//		System.out.println(s2.area());
//		System.out.println((((D3)s2).volume())));
		
		Shape s3 = new Rect(5, 4);
		
		Shape[] shapes = new Shape[3];
		shapes[0] = s1;
//		shapes[1] = s2;
		shapes[2] = s3;
		
		for(Shape s : shapes) {
			System.out.println(s.area());
			if(s instanceof D2) {
				((D2)s).legnth();
			}
			else if (s instanceof D3) {
				((D3)s).volume();
			}
		}
		
	}
	
}

package hw0910;

import java.util.Arrays;
import java.util.Scanner;

import hw0910_2.Circle;

public class ShapeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double r =0;
		System.out.println("1 원  2 원기둥 ");
		
//		while(true) {
//			int sc = scanner.nextInt();
//			switch(sc) {
//				case 1 : // 원
//					System.out.println("반지름 입력");
//					double rad = scanner.nextDouble();
//					ShapeCircle circle = new ShapeCircle();
//					circle.setRad(rad);
//					double circleArea = circle.defArea();
//					System.out.println(circleArea);
//					double circleLength = circle.defLength();
//					System.out.println(circleLength);
//					r = rad;
//					break;
//				case 2 : // 원기둥
//					System.out.println("높이 입력");
//					
//					ShapeSolidCircle shapeSolidCircle = new ShapeSolidCircle();
//					double height = scanner.nextDouble();
//					shapeSolidCircle.setHeight(height);
//					shapeSolidCircle.volume();
//					break;
//			}
//		}
		Shape[] shape = new Shape[2];
		shape[0] = new ShapeCircle(10);
		shape[1] = new ShapeSolidCircle(5.0);
		for(Shape s : shape) {
			System.out.println(s);
		}
		
		
	}


}

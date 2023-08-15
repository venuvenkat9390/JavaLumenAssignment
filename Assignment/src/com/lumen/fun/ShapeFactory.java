package com.lumen.fun;

public class ShapeFactory {
	void printArea(Shape shape,int x,int y) {
		System.out.println("printing area);");
		shape.calcArea(x, y);
		System.out.println("end of calculating");
				
	}
}

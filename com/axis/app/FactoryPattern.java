package com.axis.app;
import com.axis.factory.ShapeFactory;
import com.axis.model.Circle;
import com.axis.model.Rectangle;
import com.axis.model.Shape;

public class FactoryPattern {
	public static void main(String[] args) {
		System.out.println("===Factory pattern demo===");
		
		ShapeFactory shapeFactory=new ShapeFactory();
		Shape shape=shapeFactory.getShape("rectangle");
		shape.draw();
		
	}
}
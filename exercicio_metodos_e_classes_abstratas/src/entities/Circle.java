package entities;

import entities.enums.Color;

public class Circle extends Shape {

	Double radius;
	
	public Circle(Color color, Double radius) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * (radius * radius);
	}
	
}

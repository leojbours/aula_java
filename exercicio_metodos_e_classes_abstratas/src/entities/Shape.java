package entities;

import entities.enums.Color;

public abstract class Shape {

	Color color;
	
	public Shape() {
		
	}

	public Shape(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
}

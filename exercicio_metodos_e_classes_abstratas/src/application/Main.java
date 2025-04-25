package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		Shape[] shapes = new Shape[n];

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i+1) + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char option = sc.next().toLowerCase().charAt(0);
			
			while (option != 'r' && option != 'c') {
				System.out.print("ERROR: wrong option value. Try again (r/c): ");
				option = sc.next().toLowerCase().charAt(0);
			}
			
			System.out.print("Color: ");
			Color color = Color.valueOf(sc.next().trim().toUpperCase());
			
			if (option == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes[i] = new Rectangle(color, width, height);
			} else if (option == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes[i] = new Circle(color, radius);
			}
		}
		
		System.out.println("SHAPE AREAS:");
		for (Shape shape : shapes) {
			System.out.printf("%.2f%n", shape.area());
		}

		sc.close();
	}
}

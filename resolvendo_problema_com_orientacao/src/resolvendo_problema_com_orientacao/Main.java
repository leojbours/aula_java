package resolvendo_problema_com_orientacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangle x, y;

		x = new Triangle();
		y = new Triangle();

		System.out.println("Digite os valor dos lados do triângulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println(" ");

		System.out.println("Digite os valor dos lados do triângulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("Area triângulo X: %.4f%n", areaX);
		System.out.printf("Area triângulo X: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Maior área: x");
		} else {
			System.out.println("Maior área: y");
		}

		sc.close();
	}

}

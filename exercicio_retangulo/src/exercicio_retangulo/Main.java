package exercicio_retangulo;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();
		
		System.out.print("Digite o valor da base do retangulo: ");
		rectangle.base = sc.nextDouble();
		
		System.out.print("Digite o valor da altura do retangulo: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println();
		System.out.printf("AREA: %.2f %n", rectangle.area());
		System.out.printf("PERIMETER: %.2f %n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f %n", rectangle.diagonal());
		
		sc.close();
	}

}

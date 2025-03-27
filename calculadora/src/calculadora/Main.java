package calculadora;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		double y;
		double resultado;
		
		System.out.print("Digite um valor para ser dividido: ");
		x = sc.nextDouble();
		
		System.out.println(" ");
		
		System.out.print("Digite o divisor: ");
		y = sc.nextDouble();
		
		System.out.println(" ");
		
		while (y == 0) {
			System.out.println("Divisor invalido (O divisor não pode ser igual a zero), tente novamente: ");
			y = sc.nextDouble();
		}
		
		resultado = x / y;
		
		System.out.printf("O resultado é igual a %.2f%n", resultado);
		

	}

}

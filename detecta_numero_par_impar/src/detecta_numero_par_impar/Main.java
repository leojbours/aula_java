package detecta_numero_par_impar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double numero;
		double resultado;
		
		System.out.println("Digite um número: ");
		numero = sc.nextDouble();
		resultado = numero % 2;
		
		if (resultado == 0) {
			System.out.printf("O número %.2f é par!", numero);
		}
		else {
			System.out.printf("O número %.2f é impar!", numero);
		}
		
		sc.close();
	}

}

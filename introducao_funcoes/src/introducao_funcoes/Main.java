package introducao_funcoes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;
		int c;

		System.out.println("Digite três valores: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		int maiorNumero = max(a, b, c);

		mostraResultado(maiorNumero);

		sc.close();
	}

	public static int max(int a, int b, int c) {
		int aux;

		if (a > b && a > c) {
			aux = a;
		} else if (b > c) {
			aux = b;
		} else {
			aux = c;
		}

		return aux;

	}

	public static void mostraResultado(int higher) {
		System.out.println("O maior número é: " + higher);
	}
	
}

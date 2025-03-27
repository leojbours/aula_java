package exercicio_soma_vetor;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Quantos números você vai digitar? ");
		num = sc.nextInt();
		System.out.println();
		
		double[] vect = new double[num];
		double soma = 0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		double media = soma / vect.length;
		
		System.out.println();
		
			System.out.print("VALORES: ");
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.println();
		System.out.printf("SOMA: %.1f %n", soma);
		System.out.printf("MÉDIA: %.1f %n", media);
		
		
		sc.close();
		
	}

}

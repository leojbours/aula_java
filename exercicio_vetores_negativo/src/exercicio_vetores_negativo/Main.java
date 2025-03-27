package exercicio_vetores_negativo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Quantos numeros vai digitar (max:10)? ");
		num = sc.nextInt();
		while (num>10 || num<0) {
			System.out.println("ERRO! Você deve digitar um número de 1 a 10: ");
			num = sc.nextInt();
		}
		
		int[] vect = new int[num];
	
		for (int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Números negativos: ");
		
		for (int i=0; i<vect.length; i++) {
			if (vect[i] < 0) {
				System.out.printf("%d%n",vect[i]);
			}
		}
		
		sc.close();

	}

}

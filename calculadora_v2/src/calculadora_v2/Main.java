package calculadora_v2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int opcao;
		double x = 0;
		double y = 0;
		double soma = 0;

		do {
			System.out.println("********************************** Bem vindo a calculadora! **********************************");
			System.out.print("Escolha uma opção (1- Soma, 2- Subtração, 3- Multiplicação, 4- Divisão, 0- Encerra o programa): ");
			opcao = sc.nextInt();
			System.out.println(" ");

			if (opcao == 1) {
				System.out.print("Digite o primeiro número: ");
				x = sc.nextDouble();

				System.out.println(" ");

				System.out.print("Digite o segundo número: ");
				y = sc.nextDouble();

				soma = x + y;

				System.out.println(" ");
				System.out.println("O resultado da soma é: " + soma);
				System.out.println(" ");

			} else {
				if (opcao == 2) {
					System.out.print("Digite o primeiro número: ");
					x = sc.nextDouble();

					System.out.println(" ");

					System.out.print("Digite o segundo número: ");
					y = sc.nextDouble();

					soma = x - y;

					System.out.println(" ");
					System.out.println("O resultado da subtração é: " + soma);
					System.out.println(" ");
				} else {
					if (opcao == 3) {
						System.out.print("Digite o primeiro número: ");
						x = sc.nextDouble();

						System.out.println(" ");

						System.out.print("Digite o segundo número: ");
						y = sc.nextDouble();

						soma = x * y;

						System.out.println(" ");
						System.out.printf("O resultado da multiplicação é: %.2f %n", soma);
						System.out.println(" ");
					} else {
						if (opcao == 4) {
							System.out.print("Digite o primeiro número: ");
							x = sc.nextDouble();

							System.out.println(" ");

							System.out.print("Digite o segundo número: ");
							y = sc.nextDouble();

							while (y == 0) {
								System.out.println(" ");
								System.out.print("Erro! O segundo número não pode ser igual a 0, tente novamente: ");
								y = sc.nextDouble();
							}

							soma = x / y;

							System.out.println(" ");
							System.out.printf("O resultado da divisão é: %.2f %n", soma);
							System.out.println(" ");
						}
					}
				}
			}

		} while (opcao != 0);

		System.out.println("Sistema encerrado.");

		sc.close();
	}

}

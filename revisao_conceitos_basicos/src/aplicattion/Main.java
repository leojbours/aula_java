package aplicattion;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		1. Soma de elementos pares de um vetor
//		Crie um vetor de 10 números inteiros. Escreva um programa que some apenas os valores pares e exiba o resultado.

//		int[] vect = {1,2,3,4,5,6,7,8,9,10};
//		int soma = 0;
//		
//		for (int i = 0; i < vect.length; i++) {
//			if (vect[i] % 2 == 0) {
//				soma += vect[i];
//			}
//		}
//		
//		System.out.println(soma);

//		2. Contar vogais em uma String
//		Peça uma String ao usuário e mostre quantas vogais ela possui (desconsidere acentuação e diferenciação de maiúsculas).
//
//		Exemplo:
//		Entrada: "Leonardo"
//		Saída: 4 vogais

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine().toLowerCase();
		char[] fraseChar = frase.toCharArray();  
		ArrayList<Character> vogais = new ArrayList<>();
		
		for (int i = 0; i < fraseChar.length; i++) {
			if (fraseChar[i] == 'a' || fraseChar[i] == 'e' || fraseChar[i] == 'i' || fraseChar[i] == 'o' || fraseChar[i] == 'u') {
				vogais.add(fraseChar[i]);
			}
		}
//		
//		for (char vogal : vogais) {
//			System.out.print(vogal + " ");
//		}
//		sc.close();

//		3. Menu com switch-case
//		Implemente um pequeno menu:
//
//		1 - Somar dois números
//		2 - Subtrair dois números
//		3 - Sair
//		O programa deve pedir a opção ao usuário e realizar a operação escolhida usando switch-case.

//		Scanner sc = new Scanner(System.in);
//
//		int opcao = 0;
//
//		while (opcao != 3) {
//			System.out.println("Escolha uma opção: ");
//			System.out.println("1- somar dois números");
//			System.out.println("2- subtrair dois números");
//			System.out.println("3- Sair");
//			opcao = sc.nextInt();
//			
//			switch (opcao) {
//			
//			case 1:
//				System.out.println(2+2);
//				break;
//			case 2:
//				System.out.println(2-2);
//				break;
//			case 3:
//				break;
//			default:
//				System.out.println("Opcão errada. Tente novamente:");
//				break;
//			
//			}
//		sc.close();

//		4. Percorrer matriz e encontrar o maior valor
//		Dada a matriz:
//		int[][] numeros = {
//		    {5, 2, 9},
//		    {4, 8, 1},
//		    {7, 3, 6}
//		};
//		Escreva um programa que mostre qual é o maior valor da matriz.

//		int[][] numeros = { { 5, 2, 9 }, { 4, 8, 1 }, { 7, 3, 6 } };
//		int maiorNumero = Integer.MIN_VALUE;
//
//		for (int i = 0; i < numeros.length; i++) {
//			for(int j = 0; j < numeros[0].length; j++) {
//				if (numeros[i][j] > maiorNumero) {
//					maiorNumero = numeros[i][j];
//				}
//			}
//		}
//		
//		System.out.println(maiorNumero);
		
		
//		5. Impressão da diagonal secundária
//		Usando a mesma matriz acima, mostre os valores da diagonal secundária (de cima à direita até embaixo à esquerda).

//		int[][] numeros = { { 5, 2, 9 }, { 4, 8, 1 }, { 7, 3, 6 } };
//		int count = 2;
//		
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.println(numeros[count][i]);
//			count--;
//		}

//		1. Vetor e Condicional
//		Escreva um código em Java que:
//
//		Crie um vetor de 5 números inteiros;
//
//		Peça para o usuário digitar os valores;
//
//		Mostre quantos dos valores são pares.
		
//		//Cria vetor de inteiros
//		int[] vect = new int[5];
//		
//		//Instancia Scanner
//		Scanner sc = new Scanner(System.in);
//		
//		//Loop para colocar valores dentro do vetor
//		for (int i = 0; i < vect.length; i++) {
//			System.out.printf("Digite o %d° valor: ", (i+1));
//			vect[i] = sc.nextInt();
//			
//		}
//		
//		//Cria variavel para somar os valores do vetor fora do loop
//		int soma = 0;
//		
//		//Para cada valor dentro de cada posição do vetor ele adiciona a variavel soma;
//		for (int i = 0; i < vect.length; i++) {
//			soma += vect[i];
//		}
//		
//		//Mostra no console o valor dentro da variavel soma
//		System.out.println(soma);
//		
//		sc.close();

//		2. Lógica com switch-case
//		Você vai criar um mini menu:
//
//		java
//		Copiar
//		Editar
//		1 - Cadastrar usuário
//		2 - Remover usuário
//		3 - Listar usuários
//		4 - Sair
//		Use switch-case para imprimir mensagens diferentes de acordo com a opção escolhida. Exemplo:
//
//		Usuário escolheu 1 → "Cadastrando usuário..."
		
//		Scanner sc = new Scanner(System.in);
//		
//		//Cria variavel opcao com valor minimo para n quebrar o while
//		int opcao = Integer.MIN_VALUE;
		

//		//Loop que mostra o sistema e sai do mesmo quando é digitado a opcao 4
//		while (opcao != 4) {
//			
//			System.out.println("***ESCOLHA UMA OPCAO***");
//			System.out.println("1- Cadastrar usuário");
//			System.out.println("2- Remover usuário");
//			System.out.println("3- Listar usuário");
//			System.out.println("4- Sair");
//			opcao = sc.nextInt();
//			
//			//Switch case com opções esperadas
//			switch (opcao) {
//			case 1: 
//				System.out.println("O usuário escolheu a opcao 'cadastra usuário'");
//				break;
//			case 2:
//				System.out.println("O usuário escolheu a opcao 'remove usuário'");
//				break;
//			case 3: 
//				System.out.println("O usuário escolheu a opcao 'listar usuarios'");
//				break;
//			case 4:
//				break;
//			default:
//				System.out.print("Opcao errada, tente novamente: ");
//			}
//			
//		}
//		
//		
//		sc.close();
		
//		3. Laços e soma
//		Escreva um programa que:
//
//		Peça para o usuário informar quantos números ele quer somar;
//
//		Depois peça os números um por um;
//
//		Ao final, imprima a soma total deles.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Quantos numeros deseja somar? ");
//		int n = sc.nextInt();
//		
//		//cria vetor de tamanho informado pelo usuário
//		double[] numeros = new double[n];
//		//Variavel soma para fazer a soma dos valores dentro do vetor;
//		double soma = 0.0;
//		
//		//Loop para o usuário adicionar valores no vetor
//		for (int i = 0; i < numeros.length; i++) {
//			System.out.printf("Digite o %d° numero: ", (i+1));
//			numeros[i] = sc.nextDouble();
//		}
//		
//		//Loop para soma dos valores dentro do vetor
//		for (int i = 0; i < numeros.length; i++) {
//			soma += numeros[i];
//		}
//		
//		//Imprime a variavel soma no console
//		System.out.printf("A soma de todos os numeros é: %.2f", soma);
		
	}

}

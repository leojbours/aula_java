package application;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		int[][] matriz = { { 3, 2, 1 }, { 5, 4, 6 }, { 9, 8, 7 } };

//		int soma = 0;
//		int[] valoresDiagonal = new int[matriz[0].length];

		int countPares = 0;
		
		List<Integer> numerosPares = new ArrayList<>();

		for (int i = 0; i < matriz.length; i++) {
//			valoresDiagonal[i] = matriz[i][i];
			for (int j = 0; j < matriz[0].length; j++) {
				if (matriz[i][j] % 2 == 0) {
					countPares++;
					numerosPares.add(matriz[i][j]);
				}
				
//				soma += matriz[i][j];	
			}

		}

		System.out.println("Count pares: " + countPares);
		
		for (Integer numeroPar : numerosPares) {
			System.out.print(numeroPar + " ");
		}
		
//		for (int i = 0; i < valoresDiagonal.length; i++) {
//			System.out.print(valoresDiagonal[i] + " ");
//		}

//		System.out.println(soma);

	}

}

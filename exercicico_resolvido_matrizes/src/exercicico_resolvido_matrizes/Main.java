package exercicico_resolvido_matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		List<Integer> negatives = new ArrayList<>();
		int countNegativeNumbers = 0;
		int countForLn = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("----------");
		System.out.println("Main diagonal: ");
		
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("----------");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] < 0) {
					countNegativeNumbers++;
				}
			}
		}
		
		System.out.println("Total de números negativos: " + countNegativeNumbers);
		
		System.out.println("----------");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] < 0) {
					negatives.add(mat[i][j]);
				}
			}
		}
		
		System.out.println("Numeros negativos: ");
		
		for (Integer num : negatives) {
			countForLn++;
			if (countForLn > n) {
				System.out.println();
				System.out.print(num + " ");
				countForLn = 1;
			} else {
				System.out.print(num + " ");
			}
		}
		
		sc.close();
	}

}

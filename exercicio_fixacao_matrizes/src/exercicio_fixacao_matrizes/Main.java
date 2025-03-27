package exercicio_fixacao_matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantas linhas terá a matriz: ");
		int linhas = sc.nextInt();
		System.out.print("Digite quantas colunas terá essa matriz: ");
		int colunas = sc.nextInt();
		
		int[][] mat = new int[linhas][colunas];
		
		System.out.println("Digite a sua matriz: ");
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um número para ser achado dentro dessa matriz: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (mat[i][j] == x) {
					 System.out.println("Position " + i + "," + j + ":");
					 if (j > 0) {
						 System.out.println("Left: " + mat[i][j-1]);
					 }
					 if (i > 0) {
						 System.out.println("Up: " + mat[i-1][j]);
					 }
					 if (j < mat[0].length-1) {
						 System.out.println("Right: " + mat[i][j+1]);
					 }
					 if (i < mat.length-1) {
						 System.out.println("Down: " + mat[i+1][j]);
					 }
				}
			}
		}
	}
}

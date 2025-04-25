package main;

public class Main {

	public static void main(String[] args) {
		
		int[] original = new int[100];
		int[] pares = new int[50];
		int[] impares = new int[50];
		
		int countPares = 0;
		int countImpares = 0;
		
		for (int i = 0; i < original.length; i++) {

			original[i] = i+1;
			
			int sobra = original[i] % 2;
			
			if (sobra == 0) {
				pares[countPares] = original[i];
				countPares++;
			} else {
				impares [countImpares] = original[i];
				countImpares++;
			}
		}

		for (int i = 0; i < original.length; i++) {
			System.out.println(original[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < impares.length; i++) {
			System.out.println(impares[i]);
		}
	}

}

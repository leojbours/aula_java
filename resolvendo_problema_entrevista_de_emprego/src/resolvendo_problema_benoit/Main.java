package resolvendo_problema_benoit;

public class Main {

	public static void main(String[] args) {
		
		int[] original = new int[100];
		int[] pares = new int[50];
		int[] impares = new int[50];
		int a = 0;
		int b = 0;
		
		for (int i=0; i<original.length; i++) {
			original[i] = i;
		}
		
		for (int i=0; i<original.length; i++) {
			double sobra = original[i] % 2;
			if (sobra == 0) {
				pares[a] = original[i];
				a += 1;
			} else {
				impares[b] = original[i];
				b += 1;
			}
		}
		
		for (int i=0; i<original.length; i++) {
			System.out.println(original[i]);
		}
		
		System.out.println();

		for (int i=0; i<impares.length; i++) {
			System.out.println(impares[i]);
		}
		
		System.out.println();
	
		for (int i=0; i<pares.length; i++) {
			System.out.println(pares[i]);
		}
		
		
	}

}

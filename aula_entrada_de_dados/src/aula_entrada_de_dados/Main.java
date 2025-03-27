package aula_entrada_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double h;
		char s;
		
		System.out.print("Digite o nome de uma pessoa: ");
		x = sc.nextLine();
		
		System.out.println(" ");
		
		System.out.print("Digite a idade dessa pessoa: ");
		y = sc.nextInt();
		
		System.out.println(" ");
		
		System.out.print("Digite a altura dessa pessoa: ");
		h = sc.nextDouble();
		
		System.out.println(" ");
		
		System.out.print("Digite o sexo dessa pessoa: ");
		s = sc.next().charAt(0);
		
		System.out.println(" ");
		
		System.out.printf("%s tem %d anos, tem %.2f metros de altura e é do sexo %s! %n", x, y, h, s);
		
		sc.close();
	}

}

package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		//Declaração de variáveis
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		int gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		//Inicio do código
		
		System.out.printf("Products %n %s, which price is $ %.2f %n %s, which price is $ %.2f%n", product1, price1, product2, price2);
		System.out.println(" ");
		
		System.out.printf("%d years old, code %d and gender = %s %n", age, code, gender);
		System.out.println(" ");
		
		System.out.printf ("Measure with eight decimal places: %.8f %n", measure);
		System.out.printf ("Rounded: %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf ("US decimal point: %.3f %n", measure);
	}

}
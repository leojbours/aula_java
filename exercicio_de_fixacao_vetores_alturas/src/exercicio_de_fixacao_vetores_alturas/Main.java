package exercicio_de_fixacao_vetores_alturas;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double heightSum = 0;
		double minorAge = 0;
		int c = 0;
		
		System.out.println("Quantas pessoas serao digitadas?");
		int n = sc.nextInt();
		Person[] person = new Person[n];
		
		for (int i=0; i<person.length; i++) {
			c++;
			
			System.out.printf("Digite os dados da %d° pessoa%n", c);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Altura: ");
			double altura = sc.nextDouble();
			
			person[i] = new Person(name, idade, altura);
		}
		
		for (int i=0; i<person.length; i++) {
			 heightSum += person[i].getAltura();
		}
		
		double media = heightSum / n;
		System.out.println("ALTURA MÉDIA: " + media);
		
		for (int i=0; i<person.length; i++) {
			 if (person[i].getIdade() < 16) {
				 minorAge++;
			 }
		}
		
		double minorPercentage = (minorAge / n) * 100;
		System.out.printf("PORCENTAGEM DE MENORES DE 16 ANOS: %.2f%n", minorPercentage);
		
		for (int i=0; i<person.length; i++) {
			 if (person[i].getIdade() < 16) {
				 System.out.println(person[i].getName());
			 }
		}
		
		sc.close();
	}

}

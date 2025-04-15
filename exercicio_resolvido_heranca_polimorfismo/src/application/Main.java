package application;

import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos funcionários serão cadastrados: ");
		int n = sc.nextInt();
		System.out.println();
		
		Employee[] employees = new Employee[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados funcionário #" + (i+1) + ": ");
			
			System.out.print("É um funcionário tercerizado (s/n)? ");
			char opcao = sc.next().toLowerCase().charAt(0);
			sc.nextLine();
			
			while (opcao != 's' && opcao != 'n') {
				System.out.print("Opcao errada, tente novamente (s/n): ");
				opcao = sc.next().toLowerCase().charAt(0);
				sc.nextLine();
			}
			
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Horas: ");
			int hours = sc.nextInt();
			
			System.out.print("Valor por horas: ");
			double valuePerHours = sc.nextDouble();
			
			if (opcao == 's') {
				System.out.print("Cobrança adicional: ");
				double aditionalCharge = sc.nextDouble();
				employees[i] = new OutsourcedEmployee(name, hours, valuePerHours, aditionalCharge);
			} else {
				employees[i] = new Employee(name, hours, valuePerHours);
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		
		for (Employee employee : employees) {
			System.out.print(employee.toString());
		}
		
		sc.close();
	}
}
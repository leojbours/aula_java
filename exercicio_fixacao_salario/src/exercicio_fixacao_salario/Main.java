package exercicio_fixacao_salario;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println(employee);
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double increase = sc.nextDouble();
		employee.increaseSalary(increase);
		
		System.out.println();
		System.out.printf("Updated data: %s, $ %.2f %n", employee.name, employee.netSalary());
		
		sc.close();
	}

}

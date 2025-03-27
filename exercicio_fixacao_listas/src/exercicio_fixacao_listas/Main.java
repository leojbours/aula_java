package exercicio_fixacao_listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		
		System.out.print("How many employees will be registered: ");
		int n = sc.nextInt();
		Integer hasId;
		int id;
		

		for (int i = 1; i <= n; i++) {
			sc.nextLine();
			System.out.printf("%d# Employee's name: ", i);
			String name = sc.nextLine();
			System.out.printf("%d# Employee's id: ", i);
			id = sc.nextInt();
			hasId = hasId(employees, id);
			while (hasId != null) {
				System.out.print("Id already taken, try again: ");
				id = sc.nextInt();
				hasId = hasId(employees, id);
			}
			System.out.printf("%d# Employee's salary: ", i);
			double salary = sc.nextDouble();
			employees.add(new Employee(id, name, salary));
			System.out.println();
		}
		
		System.out.print("Enter employee id that will have the salary increased: ");
		id = sc.nextInt();
		hasId = hasId(employees, id);
		while (hasId == null) {
			System.out.print("Id inexistent, try again: ");
			id = sc.nextInt();
			hasId = hasId(employees, id);
		}
		System.out.print("Enter the percentage: ");
		double percentage = sc.nextDouble();
		
		for (Employee emp : employees) {
			if (emp.getId() == id) {
				emp.salaryIncrease(percentage);
			}
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj : employees) {
			System.out.println(obj);
		}
		
		sc.close();
		
	}
	
	
	public static Integer hasId(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId()	== id) {
				return i;
			}
		}
		return null;
	}
	
}

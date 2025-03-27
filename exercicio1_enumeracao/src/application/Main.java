package application;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entites.enums.WorkerLevel;
import entities.Department;
import entities.HourContract;
import entities.Worker;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
		String temporaryDate;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter department's name: ");
		String department = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Level: ");
		String level = sc.next();
		
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));
		
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter contract #%d data: %n", (i+1));
			sc.nextLine();
			System.out.print("Date (DD/MM/YYYY): ");
			temporaryDate = sc.nextLine();
			LocalDate dateOfContract = LocalDate.parse(temporaryDate, fmt1);
			
			System.out.print("Value per hour: ");
			
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration: ");
			
			double duration = sc.nextDouble();
			
			HourContract contract = new HourContract(dateOfContract, valuePerHour, duration);
			
			worker.addContract(contract);

		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY): ");
		YearMonth dateToFind = YearMonth.parse(sc.next(), fmt2);
		
		System.out.println(dateToFind);
		
		double income = worker.getBaseSalary();
		
		for (HourContract contract : worker.getContracts()) {
			
			YearMonth dateComparison = YearMonth.of(contract.getDate().getYear(), contract.getDate().getMonthValue());
			if (dateToFind.equals(dateComparison)) {
				income += contract.totalValue();
			}
			
		}
		
		System.out.println("Name: " + worker.getName());
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income: " + income);
		
		sc.close();
	}

}

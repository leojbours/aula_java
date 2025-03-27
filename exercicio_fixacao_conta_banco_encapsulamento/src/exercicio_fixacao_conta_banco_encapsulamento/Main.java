package exercicio_fixacao_conta_banco_encapsulamento;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		double deposit;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accName = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n): ");
		char option = sc.next().charAt(0);
		
		if (option == 'y') {
			System.out.print("Enter initial deposit value: ");
			deposit = sc.nextDouble();
			account = new Account(accNumber, accName, deposit);
		} else {
			account = new Account(accNumber, accName);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter deposit value: ");
		deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}

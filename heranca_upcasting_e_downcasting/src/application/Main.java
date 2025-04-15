package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
	
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount) acc2;
		
		// acc 3 era uma SavingsAccount, vai dar problema na execução:
		// BusinessAccount acc5 = (BusinessAccount) acc3;
		// Como prevenir:
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount) acc4;
			System.out.println(acc5.getHolder());
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount) acc3;
			acc5.updateBalance();
			System.out.println("Updated!");
		}
		
		// TESTE DE SOBREPOSIÇÃO (@Override):
		
		// Deve descontar $5.00 para fazer o saque:
		Account acc6 = new Account(1005, "Alex", 1000.0);
		acc6.withdraw(200.00);
		System.out.println("Saldo acc6: " + acc6.getBalance());
		
		// Deve fazer o saque sem descontar taxa de $5.00:
		Account acc7 = new SavingsAccount(1006, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.00);
		System.out.println("Saldo acc7 : " + acc7.getBalance());
		
		// Deve descontar $7.00 para fazer o saque:
		Account acc8 = new BusinessAccount(1007, "Bob", 1000.0, 500.0);
		acc8.withdraw(200.00);
		System.out.println("Saldo acc8: " + acc8.getBalance());
	}

}
	
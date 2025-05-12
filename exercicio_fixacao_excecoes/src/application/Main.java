package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account conta = null;
		
		try {
		
			int opcao = Integer.MIN_VALUE;
			char opcaoDepositoInicial;
			
			do {
				System.out.println("***SISTEMA BANCARIO***");
				System.out.println("0- Sair");
				System.out.println("1- Cadastrar");
				System.out.println("2- Depositar");
				System.out.println("3- Sacar");
				System.out.println("4- Consulta saldo");
				System.out.print("Escolha uma opcao: ");
				opcao = sc.nextInt();
				
				if (opcao == 1) {
					System.out.print("Digite o numero da conta: ");
					Integer numero = sc.nextInt();
					System.out.print("Digite o nome do titular: ");
					sc.nextLine();
					String titular = sc.nextLine();
					System.out.print("Digite o limite de saque: ");
					Double limiteSaque = sc.nextDouble();
					System.out.print("Vai ter deposito inicial (s/n)? ");
					opcaoDepositoInicial = sc.next().trim().charAt(0);
					if (opcaoDepositoInicial == 's') {
						System.out.print("Digite o valor do deposito inicial: ");
						Double depositoInicial = sc.nextDouble();
						conta = new Account(numero, titular, limiteSaque, depositoInicial);
					} else {
						conta = new Account(numero, titular, limiteSaque);
					}
				} else if (opcao == 2) {
					try {
						System.out.print("Digite o valor a ser depositado: ");
						Double deposito = sc.nextDouble();
						conta.deposito(deposito);
						System.out.printf("Sucesso! Saldo atual R$:%.2f%n", conta.getSaldo());
						
					} catch (NullPointerException nPoint) {
						System.out.println("ERRO NO DEPOSITO: A conta ainda não foi criada!");
					} catch (DomainException dException) {
						System.out.println("ERRO NO DEPOSITO: " + dException.getMessage());
					}
					
				} else if (opcao == 3) {
					try {
						System.out.print("Digite o valor do saque: ");
						Double saque = sc.nextDouble();
						conta.saque(saque);
						System.out.printf("Sucesso! Saldo atual R$:%.2f%n", conta.getSaldo());
						
					} catch (NullPointerException nPoint) {
						System.out.println("ERRO NO SAQUE: A conta ainda não foi criada!");
					} catch (DomainException dException) {
						System.out.println("ERRO NO SAQUE: " + dException.getMessage());
					}
				} else if (opcao == 4) {
					System.out.println("Saldo atual R$:" + conta.getSaldo());
				}
				
			} while (opcao != 0);
			
		} catch (RuntimeException e) {
			System.out.println("Ocorreu um erro inesperado");
		} finally {
			sc.close();
		}
		
		System.out.println("Sistema encerrado.");
		
	}
	 
}

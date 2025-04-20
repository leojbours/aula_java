package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o numero de pessoas para qual o imposto será calculado: ");
		int n = sc.nextInt();
		Pessoa[] pessoas = new Pessoa[n];
		double totalImposto = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Pessoa #%d:%n", (i+1));
			
			System.out.print("Pessoa fisica ou juridica (f/j)? ");
			char tipo = sc.next().trim().toLowerCase().charAt(0);
			
			while (tipo != 'f' && tipo != 'j') {
				System.out.print("ERRO: Deve ser digitado 'f' para pessoas fisicas e 'j' para pessoas juridicas: ");
				tipo = sc.next().trim().toLowerCase().charAt(0);
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Renda anual: ");
			Double rendaAnual = sc.nextDouble();
			
			if (tipo == 'f') {
				System.out.print("Gastos com saude: ");
				Double gastosComSaude = sc.nextDouble();
				pessoas[i] = new PessoaFisica(nome, rendaAnual, gastosComSaude);
			} else {
				System.out.print("Numero de funcionarios: ");
				Integer numeroDeFuncionarios = sc.nextInt();
				pessoas[i] = new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios);
			}
		}
		
		System.out.println();
		System.out.println("TAXAS A PAGAR: ");
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.toString());
			totalImposto += pessoa.calculoImposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL DE IMPOSTOS: %.2f%n", totalImposto);
		
		sc.close();
		
	}

}

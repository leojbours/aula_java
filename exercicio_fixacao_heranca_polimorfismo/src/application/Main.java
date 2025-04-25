package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número de produtos a serem cadastrados: ");
		int n = sc.nextInt();
		
		Product[] products = new Product[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Informações do produto #" + (i+1));
			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char opcao = sc.next().toLowerCase().charAt(0);
			
			while (opcao != 'c' && opcao != 'u' && opcao != 'i') {
				System.out.print("Opcao errada , tente novamente (c/u/i): ");
				opcao = sc.next().toLowerCase().charAt(0);
			}
			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Price: ");
			double preco = sc.nextDouble();
			
			sc.nextLine();
			
			if (opcao == 'u') {
				System.out.print("Data de fabricação (dd/MM/yyyy): ");
				LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), fmt1);
				products[i] = new UsedProduct(nome, preco, manufactureDate);
			} else if (opcao == 'i') {
				System.out.print("Taxa de importação: ");
				double customsFee = sc.nextDouble();
				products[i] = new ImportedProduct(nome, preco, customsFee);
			} else {
				products[i] = new Product(nome, preco);
			}
			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product product : products) {
			System.out.println(product.priceTag());			
		}
		

		
		sc.close();
	}

}

package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Formata data com dia/mes/ano
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date (DD/MM/YYYY): ");
		LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt1);
		
		//Cria cliente com os dados adquiridos com o scanner:
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		//Cria ordem com data e hora atual, status e cliente:
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), client);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		//loopa até que seja cadastrado todos os itens no pedido;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			//Cria produto:
			Product product = new Product(productName, productPrice);
			//Conecta produto com o pedido (resolve n para n):
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			//Adiona o "produto" (OrderItem) no pedido:
			order.addOrdemItem(orderItem);
		}
		
		System.out.println();
		System.out.println("ORDER SUMARRY: ");
		System.out.println(order);
		
		System.out.print("Deseja parcelar? ");
		char opcao = sc.next().trim().toLowerCase().charAt(0);
		
		if (opcao == 's') {
			System.out.print("Em quantas parecelas? ");
			int parcelas = sc.nextInt();
			System.out.printf("O pedido vai ficar %d parcelas de R$ %.2f", parcelas, (order.total() / parcelas));
		} else {
			System.out.print("Digite o valor do desconto a vista: ");
			double desconto = sc.nextDouble();
			System.out.printf("Valor com desconto a vista: %.2f", order.descontoAVista(order.total(), desconto));
		}
		
		sc.close();
	}

}

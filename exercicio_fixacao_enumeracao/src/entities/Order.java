package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private Client client;
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public Order(LocalDateTime moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void addOrdemItem(OrderItem orderItem) {
		orderItems.add(orderItem);
	}
	
	public void removeOrdemItem(OrderItem orderItem) {
		orderItems.remove(orderItem);
	}
	
	public Double total() {
		double sum = 0.0;
		for (OrderItem orderItem : orderItems) {
			sum += orderItem.subTotal();
		}
		return sum;
	}
	
	public Double descontoAVista(double valor, double percentual) {
		return valor * (1 - percentual / 100);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order Moment: " + moment.truncatedTo(ChronoUnit.SECONDS) + "\n");
		sb.append("Order status: " + status + "\n");
		sb.append("Client: " + client.getName() + " (" + client.getBirthDate().format(fmt1) + ") - " + client.getEmail() + "\n");
		sb.append("Order Items: \n");
		for (OrderItem orderItem : orderItems) {
			sb.append(orderItem.getProduct().getName() + ", R$" + String.format("%.2f", orderItem.getPrice()) + 
					", Quantity: " + orderItem.getQuantity() + ", Subtotal: R$" + String.format("%.2f", orderItem.subTotal()) + "\n");
		}
		sb.append("Total price: R$" + String.format("%.2f", total()) + "\n");
		return sb.toString();
	}
}

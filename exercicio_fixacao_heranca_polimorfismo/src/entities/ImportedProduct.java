package entities;

public class ImportedProduct extends Product {
	
	private Double customsFee;

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		sb.append(" $");
		sb.append(String.format("%.2f", totalPrice()));
		sb.append(" (Taxa alfandegaria: $");
		sb.append(String.format("%.2f", customsFee));
		sb.append(")");
		return sb.toString();
	}
	
	public double totalPrice() {
		return super.getPrice() + customsFee;
	}
	
	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
}

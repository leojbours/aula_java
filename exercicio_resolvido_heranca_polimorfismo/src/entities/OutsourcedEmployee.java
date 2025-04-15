package entities;

public final class OutsourcedEmployee extends Employee{

	private Double additionalCharge;
	
	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	
//	@Override
//	public double payment(){
//		return (hours * valuePerHour) + (additionalCharge * 1.1);
//	} O código poderia ser escrito assim, mas é melhor fazer chamando o método payment() do super;
	
	@Override
	public final double payment() {
		return super.payment() + additionalCharge * 1.1;
	}


	public Double getAdditionalCharge() {
		return additionalCharge;
	}


	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	
}

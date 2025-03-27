package entities;

import java.time.LocalDate;

public class HourContract {

	private LocalDate date;
	private Double valuePerHour;
	private Double hours;
	
	public HourContract(LocalDate date, Double valuePerHour, Double hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public LocalDate getDate() {
		return date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public Double getHours() {
		return hours;
	}

	public Double totalValue(){
		return valuePerHour * hours;
	}
}

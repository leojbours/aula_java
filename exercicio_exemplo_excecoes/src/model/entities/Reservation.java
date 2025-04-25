package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import model.exceptions.DomainException;

public class Reservation {

	//Cria formatador de data, atrelado a classe e não a o objeto
	private static final DateTimeFormatter FORMATER_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException {
		this.roomNumber = roomNumber;
		updateDates(checkIn, checkOut);
	}

	//Retorna dias entre o check-in e o check-out
	public Integer duration() {
		return (int) (ChronoUnit.DAYS.between(checkIn, checkOut)); 
	}
	
	//Metodo que muda datas da reserva, com validação;
	public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {
		if (checkIn.isBefore(LocalDate.now()) || checkOut.isBefore(LocalDate.now())) {
			throw new DomainException("Datas de reserva devem ser datas futuras");
		}
		
		if (checkOut.isBefore(checkIn)) {
			throw new DomainException("A data de check-in deve ser antes da data de check-out");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Reservation: ");
		sb.append("Room ").append(roomNumber);
		sb.append(", check-in: ").append(checkIn.format(FORMATER_1));
		sb.append(", check-out: ").append(FORMATER_1.format(checkOut));
		sb.append(", ").append(duration()).append(" nights.");
		return sb.toString();
	}

	//Getters e setters
	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckOut() {
		return checkOut;
	}
	
}
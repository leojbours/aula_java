package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Reservation;
import model.exceptions.DomainException;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		try {
			System.out.print("Room number: ");
			Integer roomNumber = sc.nextInt();
			boolean reservationCreated = false;
			char option;
			Reservation reservation = null;

			// Loopa while até a reserva ser criada com sucesso
			while (!reservationCreated) {
				try {
					System.out.print("Check-in date (dd/MM/yyyy): ");
					LocalDate checkIn = LocalDate.parse(sc.next().trim(), fmt1);
					System.out.print("check-out date (dd/MM/yyyy): ");
					LocalDate checkOut = LocalDate.parse(sc.next().trim(), fmt1);
					reservation = new Reservation(roomNumber, checkIn, checkOut);
					// Imprime mensagem de sucesso no console
					System.out.println("Reserva criada com sucesso: ");
					System.out.println(reservation);
					// Encerra loop:
					reservationCreated = true;
				} catch (DateTimeParseException parseException) {
					System.out.println("Data incorreta, tente novamente: ");
					// Pega erro de digitação de data
				} catch (DomainException illegalArgument) {
					System.out.println("Erro na reserva: " + illegalArgument.getMessage());
					// Pega erro ao cadastrar datas da reserva de forma errada
					// (check-out antes do check-in / datas de reserva antes da data atual)
				}
			}

			// Loopa para ser alterado a data da reserva
			do {
				System.out.print("Deseja alterar a data da reserva (s/n)? ");
				option = sc.next().trim().toLowerCase().charAt(0);

				if (option != 'n') {
					try {
						System.out.print("Digite a nova data de check-in (dd/MM/yyyy): ");
						LocalDate checkIn = LocalDate.parse(sc.next().trim(), fmt1);
						System.out.print("Digite a nova data de check-out (dd/MM/yyyy): ");
						LocalDate checkOut = LocalDate.parse(sc.next().trim(), fmt1);
						reservation.updateDates(checkIn, checkOut);
						System.out.println("Data alterada com sucesso!");
						System.out.println(reservation.toString());
					} catch (DateTimeParseException parseException) {
						System.out.println("Data incorreta, tente novamente: ");
						// Pega erro de digitação de data
					} catch (DomainException illegalArgument) {
						System.out.println("Erro na reserva: " + illegalArgument.getMessage());
						// Pega erro ao cadastrar datas da reserva de forma errada
						// (check-out antes do check-in / datas de reserva antes da data atual)
					}
				}

			} while (option != 'n');

			System.out.println(reservation.toString());
		} catch (RuntimeException e) {
			System.out.println("Unexpected error");
		}

		sc.close();
	}

}

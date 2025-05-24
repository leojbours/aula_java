package main;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;
import resources.GeneralFormatter;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rental data:");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();

        LocalDateTime startDate = null;
        LocalDateTime finishDate = null;
        boolean startParseWorked = false;
        boolean finishParseWorked = false;

        do {
            try {

                if (!startParseWorked) {
                System.out.print("Pick-up (dd/MM/yyyy HH:mm): ");
                startDate = LocalDateTime.parse(sc.nextLine(), GeneralFormatter.FMT_1);
                startParseWorked = true;
                }

                if (!finishParseWorked) {
                System.out.print("Return (dd/MM/yyyy HH:mm): ");
                finishDate = LocalDateTime.parse(sc.nextLine(), GeneralFormatter.FMT_1);
                finishParseWorked = true;
                }

            } catch (Exception e) {
                System.out.println("Incorrect date format, try again:");
            }
        } while (!(startParseWorked && finishParseWorked));

        CarRental carRental = new CarRental(startDate, finishDate, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.printf("Basic payment: %.2f%n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Tax: %.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Total: %.2f%n", carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}
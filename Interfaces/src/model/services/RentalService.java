package model.services;

import model.entities.CarRental;

import java.time.Duration;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;

    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental) {

        double rentalTimeMinutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double rentalTimeHours = rentalTimeMinutes / 60.0;

        if (rentalTimeHours <= 12.0) {
            carRental.getInvoice().setBasicPayment(Math.ceil(rentalTimeHours) * pricePerHour);
        } else {
            carRental.getInvoice().setBasicPayment(Math.ceil(rentalTimeHours / 24.0) * pricePerDay);
        }

        carRental.getInvoice().setTax(taxService.tax(carRental.getInvoice().getBasicPayment()));

    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }
}

package model.services;

public interface PaymentService
{
    double tax(double value);
    double fee(double value);
}

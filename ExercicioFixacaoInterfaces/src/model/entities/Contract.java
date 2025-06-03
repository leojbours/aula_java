package model.entities;

import java.time.LocalDate;
import java.util.List;

import model.services.PaymentService;

public class Contract
{
    
    private int contractNumber;
    private double totalValue;
    private LocalDate contractDate;
    
    PaymentService    paymentService;
    List<Installment> installments;
    
}

package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.services.PaymentService;

public class Contract
{
    
    private int       contractNumber;
    private double    totalValue;
    private LocalDate contractDate;

    List<Installment> installments = new ArrayList<>();
    
    public Contract( int contractNumber, double totalValue, LocalDate contractDate)
    {
        this.contractNumber = contractNumber;
        this.totalValue = totalValue;
        this.contractDate = contractDate;
    }
    
    public int getContractNumber()
    {
        return contractNumber;
    }
    
    public double getTotalValue()
    {
        return totalValue;
    }
    
    public void setTotalValue( double totalValue )
    {
        this.totalValue = totalValue;
    }
    
    public LocalDate getContractDate()
    {
        return contractDate;
    }
    
    public void setContractDate( LocalDate contractDate )
    {
        this.contractDate = contractDate;
    }
    
    public List<Installment> getInstallments()
    {
        return installments;
    }
    
}

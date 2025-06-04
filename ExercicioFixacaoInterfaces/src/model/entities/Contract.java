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
    
    PaymentService    paymentService;
    List<Installment> installments = new ArrayList<>();
    
    public Contract( int contractNumber, double totalValue, LocalDate contractDate, PaymentService paymentService )
    {
        this.contractNumber = contractNumber;
        this.totalValue = totalValue;
        this.contractDate = contractDate;
        this.paymentService = paymentService;
    }
    
    public void processContract( Contract contract, int months )
    {
        for ( int i = 1; i <= months; i++ )
        {
            double monthInstallmentValue = paymentService.fee( contract.getTotalValue() / months, i );
            monthInstallmentValue = paymentService.tax( monthInstallmentValue );
            
            Installment installment = new Installment( monthInstallmentValue, contractDate.plusMonths( i ) );
            
            contract.getInstallments().add( installment );
        }
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
    
    public PaymentService getPaymentService()
    {
        return paymentService;
    }
    
    public void setPaymentService( PaymentService paymentService )
    {
        this.paymentService = paymentService;
    }
    
    public List<Installment> getInstallments()
    {
        return installments;
    }
    
    public void setInstallments( List<Installment> installments )
    {
        this.installments = installments;
    }
    
}

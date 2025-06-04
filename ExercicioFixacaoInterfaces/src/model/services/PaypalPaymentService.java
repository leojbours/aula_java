package model.services;

public class PaypalPaymentService implements PaymentService
{
    double tax = 0.02;
    double monthlyFee = 0.01;
    
    @Override
    public double tax( double value )
    {
        return value + value * tax;
    }
    
    @Override
    public double fee( double value, int months )
    {
        return value + ( value * months ) * monthlyFee;
    }
    
    public double getTax()
    {
        return tax;
    }
    
    public void setTax( double tax )
    {
        this.tax = tax;
    }
    
    public double getMonthlyFee()
    {
        return monthlyFee;
    }
    
    public void setMonthlyFee( double monthlyFee )
    {
        this.monthlyFee = monthlyFee;
    }
}

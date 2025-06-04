package model.entities;

import java.time.LocalDate;

public class Installment
{
    private double value;
    private LocalDate dueDate;
    
    public Installment( double value, LocalDate dueDate )
    {
        this.value = value;
        this.dueDate = dueDate;
    }
    
    @Override
    public String toString()
    {
        return "Installment{" +
                "value=" + value +
                ", dueDate=" + dueDate +
                '}';
    }
    
    public double getValue()
    {
        return value;
    }
    
    public void setValue( double value )
    {
        this.value = value;
    }
    
    public LocalDate getDueDate()
    {
        return dueDate;
    }
    
    public void setDueDate( LocalDate dueDate )
    {
        this.dueDate = dueDate;
    }
}

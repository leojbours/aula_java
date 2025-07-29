package entities;

public class Product
    implements
        Comparable<Product>
{
    private String name;
    private double price;
    
    public Product( String name, double price )
    {
        this.name = name;
        this.price = price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName( String name )
    {
        this.name = name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice( double price )
    {
        this.price = price;
    }
    
    @Override
    public int compareTo( Product p )
    {
        if ( p.price < this.price )
        {
            return 1;
        }
        
        else if ( p.price > this.price )
        {
            return -1;
        }
        
        else
        {
            return 0;
        }
    }
    
    @Override
    public String toString()
    {
        return name + " - R$ " + price;
    }
}

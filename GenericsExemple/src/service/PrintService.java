package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T>
{
    private List<T> list = new ArrayList<>();

    public void addValue( T value )
    {
        list.add( value );
    }

    public T first()
    {
        if ( list.isEmpty() )
        {
            throw new IllegalArgumentException( "List must not be empty!" );
        }

        else
        {
            return list.getFirst();
        }
    }

    public void print()
    {
        String string = "[";
        
        if ( ! list.isEmpty() )
        {
            string += list.getFirst();
        }
        
        for ( int i = 1; i < list.size(); i++ )
        {
            string += ", " + list.get(i);
        }
        
        string += "]";
        
        System.out.println(string);
    }
}

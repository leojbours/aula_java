package util;

import entities.UserLogin;

public class ReaderSimpleFactory
{
    @SuppressWarnings( "unchecked" )
    public static <T> Reader<T> getReader( Class<T> type )
    {
        if ( type == UserLogin.class )
        {
            return ( Reader<T> ) new UserReader();
        }
        
        throw new IllegalArgumentException( "Not a valid type!" );
    }
}

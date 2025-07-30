package entities;

import java.time.Instant;
import java.util.Objects;

public class UserLogin
{
    private String username;
    private Instant loginInstant;
    
    public UserLogin( String username, Instant loginInstant )
    {
        this.username = username;
        this.loginInstant = loginInstant;
    }
    
    @Override
    public boolean equals( Object o )
    {
        if ( o == null || getClass() != o.getClass() )
            return false;
        UserLogin userLogin = ( UserLogin ) o;
        return Objects.equals( username, userLogin.username );
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hashCode( username );
    }
}

package util;

import entities.UserLogin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserReader
    implements Reader<UserLogin>
{
    @Override
    public Collection<UserLogin> read( File file )
    {
        List<UserLogin> userLogins = new ArrayList<>();
        
        try ( BufferedReader bf = new BufferedReader( new FileReader( file ) ) )
        {
            String line = bf.readLine();
            
            while ( line != null )
            {
                String[] attributes = line.split( " " );
                UserLogin userLogin = new UserLogin( attributes[0], Instant.parse( attributes[1] ) );
                
                userLogins.add( userLogin );
                
                line = bf.readLine();
            }
        }
        
        catch ( IOException e )
        {
            System.out.println( "Error reading file: " + e.getMessage() );
        }
        
        return userLogins;
    }
}

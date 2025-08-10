package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main
{
    public static void main( String[] args )
    {
        Map<String, Integer> candidates = new HashMap<>();
        
        try ( BufferedReader br = new BufferedReader( new FileReader( "src/in.txt" ) ) )
        {
            String line = br.readLine();
            
            while ( line != null )
            {
                String[] attributes = line.split( "," );
                
                if ( candidates.get( attributes[0] ) == null )
                {
                    candidates.put( attributes[0], Integer.parseInt( attributes[1] ) );
                }
                
                else
                {
                    candidates.compute( attributes[0], ( key, value ) -> value != null ? value + Integer.parseInt( attributes[1] ) : Integer.parseInt( attributes[1] ) );
                }
                
                line = br.readLine();
            }
        }
        
        catch ( IOException e )
        {
            System.out.println( e.getMessage() );
        }
        
        for ( String candidate : candidates.keySet() )
        {
            System.out.println( candidate + ": " + candidates.get( candidate ) + " votes" );
        }
    }
}
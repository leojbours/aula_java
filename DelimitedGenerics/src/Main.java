import entities.Product;
import services.CalculationService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main( String[] args )
    {
        String path = "in.txt";
        
        File file = new File( path );
        
        List<Product> list = new ArrayList<>();
        
        try( BufferedReader br = new BufferedReader( new FileReader( path ) ) )
        {
            String line = br.readLine();
            
            while ( line != null )
            {
                String[] splitLine = line.split( "," );
                list.add( new Product( splitLine[0], Double.parseDouble( splitLine[1] ) ) );
                line = br.readLine();
            }
            
            Product x = CalculationService.max( list );
            System.out.println( "Max: " + x );
        }
        
        catch ( Exception e )
        {
            System.out.println("Não foi possível ler o arquivo! " + e.getMessage());
        }
    }
}
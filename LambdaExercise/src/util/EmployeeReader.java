package util;

import entities.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeReader
{
    public static List<Employee> readEmployees( String path )
    {
        List<Employee> employees = new ArrayList<>();
        
        try ( BufferedReader br = new BufferedReader( new FileReader( path ) ) )
        {
            String line = br.readLine();
            
            while ( line != null )
            {
                String[] attributes = line.split( "," );
                
                Employee employee = new Employee( attributes[0], attributes[1], Double.parseDouble( attributes[2] ) );
                
                employees.add( employee );
                
                line = br.readLine();
            }
        }
        
        catch ( IOException e )
        {
            System.out.println( "Erro ao ler arquivo: " + e.getMessage() );
        }
        
        return employees;
    }
}

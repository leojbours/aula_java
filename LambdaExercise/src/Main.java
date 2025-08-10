import entities.Employee;
import util.EmployeeReader;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Locale.setDefault( Locale.US );
        Scanner sc = new Scanner( System.in );
        
        System.out.print( "Digite o valor do salário mínimo para ser listado: " );
        double filterSalary = sc.nextDouble();
        
        List<Employee> employees = EmployeeReader.readEmployees( "in.txt" );
        
        List<String> employeesNames = employees.stream()
                                               .filter( e -> e.getSalary() >= filterSalary )
                                               .map( Employee::getEmail )
                                               .sorted( Comparator.comparing( String::toUpperCase ) )
                                               .toList();
        
        System.out.println( "Funcionários que ganham mais que o valor informado: " );
        employeesNames.forEach( System.out::println );
        
        double sumEmployeesWithInitialLetterM =  employees.stream()
                                                          .filter( e -> e.getName().toUpperCase().charAt( 0 ) == 'M' )
                                                          .map( Employee::getSalary )
                                                          .reduce( 0.0, Double::sum );
        
        System.out.println( "Soma do salário dos funcionários cujo o qual o nome começa com a letra M: " );
        System.out.println( sumEmployeesWithInitialLetterM );
    }
}
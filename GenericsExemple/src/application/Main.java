package application;

import service.PrintService;

import java.util.Scanner;

public class Main
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in );
        
        PrintService<String> ps = new PrintService<>();
        
        System.out.print("How many values? ");
        int n = sc.nextInt();
        
        sc.nextLine();
        
        for ( int i = 0; i < n; i++ )
        {
            String value = sc.nextLine();
            ps.addValue( value );
        }
        
        ps.print();
        System.out.println("First: " + ps.first());
    }
}
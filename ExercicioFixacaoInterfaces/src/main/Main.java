package main;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalPaymentService;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main( String[] args )
    {
        
        final DateTimeFormatter FORMATO_1 = DateTimeFormatter.ofPattern( "dd/MM/yyyy" );
        
        Scanner sc = new Scanner( System.in );
        
        System.out.println("Enter the contract data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Date (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse( sc.nextLine(), FORMATO_1 );
        System.out.print("Contract value: ");
        double value = sc.nextDouble();
        System.out.print("Enter number of installments: ");
        int numberOfInstallments = sc.nextInt();
        
        Contract contract = new Contract( number, value, date );
        ContractService contractService = new ContractService(new PaypalPaymentService());
        contractService.processContract( contract, numberOfInstallments );
        
        System.out.println("Installments: ");
        contract.getInstallments().forEach( System.out::println );
        
    }
}
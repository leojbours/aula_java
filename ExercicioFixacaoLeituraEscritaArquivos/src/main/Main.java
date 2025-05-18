package main;

import entities.Product;
import resources.FileManager;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char option;

        do {
            System.out.println("--- PRODUCTS SYSTEM ---");
            System.out.println("R = REGISTER A NEW PRODUCT");
            System.out.println("L = LIST EXISTING PRODUCTS");
            System.out.println("Q = QUIT APPLICATION");
            System.out.print("CHOOSE A OPTION: ");
            option = sc.next().trim().toUpperCase().charAt(0);

            switch (option) {
                case 'R': {
                    System.out.println("--- REGISTERING A NEW PRODUCT ---");
                    System.out.print("PRODUCT NAME: ");
                    sc.nextLine(); // Consome linha extra
                    String name = sc.nextLine().trim().toUpperCase();
                    System.out.print("PRODUCT PRICE: ");
                    double price = sc.nextDouble();
                    System.out.print("QUANTITY IN STOCK: ");
                    int quantityInStock = sc.nextInt();

                    Product product = new Product(name, price, quantityInStock);

                    FileManager.write(product);

                    break;
                }
                case 'L': {
                    ArrayList<Product> products = FileManager.read();
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                }
                case 'Q': {
                    System.out.println("EXITING SYSTEM, THANK YOU");
                    break;
                }
                default: {
                    System.out.println("WRONG OPTION, TRY AGAIN:");
                    break;
                }

            }

        } while (option != 'Q');

        sc.close();

    }
}
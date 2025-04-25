package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		method1();

		System.out.println("End of the program");
		
		
	}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		System.out.println("***METHOD1 END***");
	}
	
	public static void method2() {
		
		System.out.println("***METHOD 2 START***");
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException outOfBounds) {
			System.out.println("Invalid position!");
			outOfBounds.printStackTrace();
		} catch (InputMismatchException imputMismatch) {
			System.out.println("Invalid input!");
		}
		
		System.out.println("***METHOD2 END***");
		sc.close();
	}
	
}

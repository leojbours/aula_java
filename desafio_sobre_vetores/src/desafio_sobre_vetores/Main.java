package desafio_sobre_vetores;

import java.util.Scanner;

import entities.Room;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Room[] vect = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			
			System.out.printf("Rent #%d: %n", (i+1));
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			vect[roomNumber] = new Room(name, email);
			
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			
			if (vect[i]!=null) {
				System.out.printf("%d: %s, %s %n", i, vect[i].getName(), vect[i].getEmail());
			}
			
		}
		
		
		sc.close();		
	}

}

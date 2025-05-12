package main;

import java.io.File;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		//Pega nome do arquivo:
		System.out.println("getName: " + path.getName());
		//Pega caminho do arquivo(Somente as pastas até o arquivo):
		System.out.println("getParent: " + path.getParent());
		//Pega caminho completo incluindo nome do arquivo:
		System.out.println("getPath: " + path.getPath());
	}

}

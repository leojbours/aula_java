 package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		String[] lines = new String[] { "BOM DIA", "BOA TARDE", "BOA NOITE"};
		
		String path = "/home/leonardo/eclipse-workspace/aula_java/escrevendo_arquivo_de_texto/in.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
		
	}

}

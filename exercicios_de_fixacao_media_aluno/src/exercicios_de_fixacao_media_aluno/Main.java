package exercicios_de_fixacao_media_aluno;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno student = new Aluno();
		
		System.out.print("Name: ");
		student.name = sc.nextLine();
		System.out.print("First grade: ");
		student.grade1 = sc.nextDouble();
		System.out.print("Second grade: ");
		student.grade2 = sc.nextDouble();
		System.out.print("Third grade: ");
		student.grade3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		
		if (student.missingPoints() > 0) {
			System.out.printf("FAILED! MISSING POINTS: %.2f%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}
		
		
		sc.close();
		
	}

}

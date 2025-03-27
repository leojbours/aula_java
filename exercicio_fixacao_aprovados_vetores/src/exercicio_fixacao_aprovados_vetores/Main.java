package exercicio_fixacao_aprovados_vetores;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int c = 0;
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		Aluno[] aluno = new Aluno[n];
		
		for (int i=0; i<aluno.length; i++) {
			c++;
			System.out.printf("Digite nome, primeira e segunda nota do %d° aluno: %n", c);
			sc.nextLine();
			String name = sc.nextLine();
			double firstGrade = sc.nextInt();
			double secondGrade = sc.nextInt();
			aluno[i] = new Aluno(name, firstGrade, secondGrade);
		}
		
		System.out.println("Alunos aprovados: ");
		for (int i=0; i<aluno.length; i++) {
			if (aluno[i].media()>=6) {
				System.out.println(aluno[i].getName());
			}
		}
		
		
		sc.close();
	}

}

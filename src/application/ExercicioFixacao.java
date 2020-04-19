package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Cursos;

public class ExercicioFixacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Set<Cursos> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			System.out.printf("Digite o %d aluno: ", i + 1);
			int codAluno = sc.nextInt();
			set.add(new Cursos(a, codAluno));
			System.out.println();
		}
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			System.out.printf("Digite o %d aluno: ", i + 1);
			int codAluno = sc.nextInt();
			set.add(new Cursos(b, codAluno));
			System.out.println();
		}
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		for (int i = 0; i < c; i++) {
			System.out.printf("Digite o %d aluno: ", i + 1);
			int codAluno = sc.nextInt();
			set.add(new Cursos(c, codAluno));
		}
		
		System.out.println("Total students: " + set.size());
		
		
		sc.close();
	}

}

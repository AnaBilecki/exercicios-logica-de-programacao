package application;

import java.util.Locale;
import java.util.Scanner;

public class E10_aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media;
		String nomes[] = new String[10];
		double notas1[] = new double[10];
		double notas2[] = new double[10];
		
		System.out.print("Quantos alunos serão digitados? ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			nomes[i] = sc.nextLine();
			notas1[i] = sc.nextDouble();
			notas2[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		System.out.println("Alunos aprovados:");
		
		for (int i = 0; i < n; i++) {
			media = (notas1[i] + notas2[i]) / 2.0;
			if (media >= 6.0) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}

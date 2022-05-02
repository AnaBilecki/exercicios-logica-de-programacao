package application;

import java.util.Locale;
import java.util.Scanner;

public class E07_abaixo_da_media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double soma = 0.0;
		double media;
		double vetor[] = new double[10];
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		media = soma / n;
		
		System.out.println();
		System.out.printf("MÉDIA DO VETOR = %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		
		for (int i = 0; i < n; i++) {
			if (vetor[i] < media) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}
}

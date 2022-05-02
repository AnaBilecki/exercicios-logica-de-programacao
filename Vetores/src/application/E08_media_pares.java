package application;

import java.util.Locale;
import java.util.Scanner;

public class E08_media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int soma = 0;
		int quantidade = 0;
		int vetor[] = new int[10];
		double media = 0.0;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				soma += vetor[i];
				quantidade++;
			}
		}
		
		if (quantidade != 0) {
			media = (double) soma / quantidade;
			System.out.printf("MÉDIA DOS PARES: %.1f", media);
		} else {
			System.out.print("NENHUM NÚMERO PAR");
		}
		
		sc.close();
	}
}

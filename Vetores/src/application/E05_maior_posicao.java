package application;

import java.util.Locale;
import java.util.Scanner;

public class E05_maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		double maior = 0;
		int posicao = 0;
		double numeros[] = new double[10];
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextDouble();
		}
		
		maior = numeros[0];
		
		for (int i = 0; i < n; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;
			}
		}
		
		System.out.println();
		System.out.printf("MAIOR VALOR = %.1f%n", maior);
		System.out.print("POSIÇÃO DO MAIOR VALOR = " + posicao);
				
		sc.close();
	}
}

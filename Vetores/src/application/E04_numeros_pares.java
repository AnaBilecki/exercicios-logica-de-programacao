package application;

import java.util.Scanner;

public class E04_numeros_pares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int quantidade = 0;
		int numeros[] = new int[10];
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES:");
		
		for (int i = 0; i < n; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(" " + numeros[i]);
				quantidade++;
			}
		}
		
		System.out.println();
		System.out.println();
		System.out.print("QUANTIDADE DE PARES: " + quantidade);
		
		sc.close();
	}
}

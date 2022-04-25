package application;

import java.util.Scanner;

public class E12_par_impar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, numero;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			if (numero == 0) {
				System.out.println("NULO");
			} else if (numero % 2 == 0) {
				if (numero > 0) {
					System.out.println("PAR POSITIVO");
				} else {
					System.out.println("PAR NEGATIVO");
				}
			} else {
				if (numero > 0) {
					System.out.println("ÍMPAR POSITIVO");
				} else {
					System.out.println("ÍMPAR NEGATIVO");
				}
			}
		}
		
		sc.close();
	}
}

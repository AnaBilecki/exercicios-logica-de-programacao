package application;

import java.util.Locale;
import java.util.Scanner;

public class E14_divisao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, numerador, denominador;
		double divisao;
		
		System.out.print("Quantos casos voc� vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Entre com o numerador: ");
			numerador = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			denominador = sc.nextInt();
			if (denominador == 0) {
				System.out.println("DIVIS�O IMPOSS�VEL");
			} else {
				divisao = (double) numerador / denominador;
				System.out.printf("DIVIS�O = %.2f%n", divisao);
			}
		}
		
		sc.close();
	}
}

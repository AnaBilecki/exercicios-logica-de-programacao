package application;

import java.util.Locale;
import java.util.Scanner;

public class E13_media_ponderada {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double numero1, numero2, numero3, media;
		
		System.out.print("Quantos casos você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite três números:");
			numero1 = sc.nextDouble();
			numero2 = sc.nextDouble();
			numero3 = sc.nextDouble();
			media = (numero1 * 2.0 + numero2 * 3.0 + numero3 * 5.0) / 10.0;
			System.out.printf("MÉDIA = %.1f%n", media);
		}
		
		sc.close();
	}
}

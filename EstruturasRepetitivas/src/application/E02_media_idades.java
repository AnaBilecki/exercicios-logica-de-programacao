package application;

import java.util.Locale;
import java.util.Scanner;

public class E02_media_idades {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade;
		int quantidade = 0;
		double soma = 0;
		double media;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		while (idade >= 0) {
			soma += idade;
			quantidade++;
			idade = sc.nextInt();
		}
		
		if (quantidade == 0) {
			System.out.println("IMPOSSÍVEL CALCULAR");
		} else {
			media = soma / quantidade;
			System.out.printf("MÉDIA = %.2f", media);
		}
		
		sc.close();
	}
}

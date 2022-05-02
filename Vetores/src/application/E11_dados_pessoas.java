package application;

import java.util.Locale;
import java.util.Scanner;

public class E11_dados_pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int mulheres = 0;
		int homens = 0;
		double hMulheres = 0.0;
		double media = 0.0;
		double alturas[] = new double[10];
		String generos[] = new String[10];
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			alturas[i] = sc.nextDouble();
			sc.nextLine();
			System.out.print("Gênero da " + (i + 1) + "a pessoa: ");
			generos[i] = sc.nextLine();
		}
		
		double menor = alturas[0];
		double maior = alturas[0];
		
		for (int i = 0; i < n; i++) {
			if (alturas[i] > maior) {
				maior = alturas[i];
			}
			if (alturas[i] < menor) {
				menor = alturas[i];
			}
		}
		
		System.out.printf("Menor altura = %.2f%n", menor);
		System.out.printf("Maior altura = %.2f%n", maior);
		
		for (int i = 0; i < n; i++) {
			if (generos[i].equals("F")) {
				hMulheres += alturas[i];
				mulheres++;
			}
		}
		
		if (mulheres == 0) {
			System.out.println("Impossível calcular a altura média das mulheres");
		} else {
			media = hMulheres / mulheres;
			System.out.printf("Média das alturas das mulheres = %.2f%n", media);
		}

		homens = n - mulheres;
		System.out.print("Número de homens = " + homens);
		
		sc.close();
	}
}

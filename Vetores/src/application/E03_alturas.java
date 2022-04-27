package application;

import java.util.Locale;
import java.util.Scanner;

public class E03_alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		int quantidade = 0;
		double media, porcentagem;
		double soma = 0;
		String nomes[] = new String[10];
		int idades[] = new int[10];
		double alturas[] = new double[10];
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) +"a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		for (int i = 0; i < n; i++) {
			soma += alturas[i];
		}
		
		media = soma / n;
		
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				quantidade++;
			}
		}
		
		porcentagem = ((double) quantidade / n) * 100;
		
		System.out.println();
		System.out.printf("Altura média: %.2f%n", media);
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", porcentagem);
		
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}
		
		sc.close();
	}
}

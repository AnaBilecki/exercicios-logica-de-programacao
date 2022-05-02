package application;

import java.util.Scanner;

public class E09_mais_velho {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int idades[] = new int[10];
		String nomes[] = new String[10];
		
		System.out.print("Quantas pessoas você vai digitar? ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			sc.nextLine();
		}
		
		int maior = idades[0];
		String nome = nomes[0];
		
		for (int i = 1; i < n; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				nome = nomes[i];
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nome);
		
		sc.close();
	}
}

package application;

import java.util.Scanner;

public class E11_dentro_fora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, numero;
		int dentro = 0;
		int fora = 0;
		
		System.out.print("Quantos números você vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			numero = sc.nextInt();
			if (numero >= 10 && numero <= 20) {
				dentro++;
			} else {
				fora++;
			}
		}
		
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		
		sc.close();
	}
}

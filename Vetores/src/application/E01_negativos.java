package application;

import java.util.Scanner;

public class E01_negativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int vetor[] = new int[10];
		
		System.out.print("Quantos n�meros voc� vai digitar? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um n�mero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("N�MEROS NEGATIVOS: ");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}
}

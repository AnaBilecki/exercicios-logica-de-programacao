package application;

import java.util.Scanner;

public class E06_soma_vetores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		int vetorA[] = new int[10];
		int vetorB[] = new int[10];
		int resultante[] = new int[10];
		
		System.out.print("Quantos valores vai ter cada vetor? ");
		n = sc.nextInt();
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < n; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < n; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			resultante[i] = vetorA[i] + vetorB[i];
		}
		
		System.out.println("VETOR RESULTANTE: ");
		for (int i = 0; i < n; i++) {
			System.out.println(resultante[i]);
		}
		
		sc.close();
	}
}

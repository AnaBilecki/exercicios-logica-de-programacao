package application;

import java.util.Scanner;

public class E04_cada_linha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Qual a ordem da matriz? ");
		n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
		
		for (int i = 0; i < n; i++) {
			int maior = matriz[i][0];
			for (int j = 1; j < n; j++) {
				if (matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();
	}
}

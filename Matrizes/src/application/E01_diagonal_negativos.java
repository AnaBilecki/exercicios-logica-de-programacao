package application;

import java.util.Scanner;

public class E01_diagonal_negativos {

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
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < n; i++) {
				System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		
		int negativos = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					negativos++;
				}
			}
		}
		
		System.out.print("QUANTIDADE DE NEGATIVOS = " + negativos);
		
		sc.close();
	}
}

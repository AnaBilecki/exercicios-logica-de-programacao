package application;

import java.util.Locale;
import java.util.Scanner;

public class E05_soma_matrizes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		m = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		n = sc.nextInt();

		int[][] mA = new int[m][n];
		int[][] mB = new int[m][n];
		int[][] mC = new int[m][n];
		
		System.out.println("Digite os valores da matriz A: ");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mA[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B: ");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mB[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				mC[i][j] = mA[i][j] + mB[i][j];
			}
		}
		
		System.out.println("MATRIZ SOMA:");
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mC[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}

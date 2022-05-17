package application;

import java.util.Locale;
import java.util.Scanner;

public class E02_soma_linhas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, m;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		n = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		m = sc.nextInt();

		double[][] matriz = new double[n][m];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Digite os elementos da " + (i + 1) + "a. linha:");
			for (int j = 0; j < m; j++) {
				matriz[i][j] = sc.nextDouble();
			}
		}
		
		double[] vetor = new double[10];
		
		for (int i = 0; i < n; i++) {
			vetor[i] = 0;
			for (int j = 0; j < m; j++) {
				vetor[i] += matriz[i][j];
			}
		}
		
		System.out.println("VETOR GERADO:");
		for (int i = 0; i < n; i++) {
			System.out.printf("%.1f%n", vetor[i]);
		}
		
		sc.close();
	}
}

package application;

import java.util.Locale;
import java.util.Scanner;

public class E16_experiencias {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, quantidade; 
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		int total = 0;
		String tipo = "";
		double percentualCoelhos, percentualRatos, percentualSapos;
		
		System.out.print("Quantos casos de teste serão digitados? ");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantidade = sc.nextInt();
			sc.nextLine();
			System.out.print("Tipo de cobaia: ");
			tipo = sc.nextLine();
			if (tipo.equals("C")) {
				coelhos += quantidade;
			} else if (tipo.equals("R")) {
				ratos += quantidade;
			} else if (tipo.equals("S")) {
				sapos += quantidade;
			}
			total += quantidade;
		}
		
		percentualCoelhos = ((double) coelhos / total) * 100.0;
		percentualRatos = ((double) ratos / total) * 100.0;
		percentualSapos = ((double) sapos/ total) * 100.0;
		
		System.out.println("RELATÓRIO FINAL:");
		System.out.println("Total: " + total + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f%n", percentualCoelhos);
		System.out.printf("Percentual de ratos: %.2f%n", percentualRatos);
		System.out.printf("Percentual de sapos: %.2f", percentualSapos);
		
		sc.close();
	}
}

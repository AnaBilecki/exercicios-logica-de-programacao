package application;

import java.util.Locale;
import java.util.Scanner;

public class E12_comerciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		String[] nomes = new String[10];
		double[] precosCompra = new double[10];
		double[] precosVenda = new double[10];
		
		System.out.print("Serão digitados dados de quantos produtos? ");
		n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Produto " + (i + 1) + ":");
			System.out.print("Nome: ");
			nomes[i] = sc.nextLine();
			System.out.print("Preço de compra: ");
			precosCompra[i] = sc.nextDouble();
			System.out.print("Preço de venda: ");
			precosVenda[i] = sc.nextDouble();
			sc.nextLine();
		}
		
		int abaixo = 0;
		int entre = 0;
		int acima = 0;
		
		for (int i = 0; i < n; i++) {
			if ((precosVenda[i] / precosCompra[i]) - 1 < 0.1) {
				abaixo++;
			} else if ((precosVenda[i] / precosCompra[i]) - 1 <= 0.2) {
				entre++;
			} else {
				acima++;
			}
		}
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println("Lucro abaixo de 10%: " + abaixo);
		System.out.println("Lucro entre 10% e 20%: " + entre);
		System.out.println("Lucro acima de 20%: " + acima);
		
		double totalCompra = 0;
		double totalVenda = 0;
		
		for (int i = 0; i < n; i++) {
			totalCompra += precosCompra[i];
			totalVenda += precosVenda[i];
		}
		
		System.out.printf("Valor total de compra: %.2f%n", totalCompra);
		System.out.printf("Valor total de venda: %.2f%n", totalVenda);
		System.out.printf("Lucro total: %.2f", totalVenda - totalCompra);
		
		sc.close();
	}
}

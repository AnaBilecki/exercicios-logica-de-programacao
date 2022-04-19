package application;

import java.util.Locale;
import java.util.Scanner;

public class E05_troco_verificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double precoUnitario, dinheiro, troco, total, resto;
		int quantidade;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiro = sc.nextDouble();
		
		total = precoUnitario * quantidade;
		
		if (dinheiro >= total) {
			troco = dinheiro - total;
			System.out.printf("TROCO = %.2f", troco);
		} else {
			resto = total - dinheiro;
			System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f REAIS", resto);
		}
		
		sc.close();
	}
}

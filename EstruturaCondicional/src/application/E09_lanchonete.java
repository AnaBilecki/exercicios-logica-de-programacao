package application;

import java.util.Locale;
import java.util.Scanner;

public class E09_lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = 0;
		int codigo, quantidade;
		
		System.out.print("Código do produto comprado: ");
		codigo = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidade = sc.nextInt();
		
		switch (codigo) {
		case 1:
			valor = 5.00 * quantidade;
			break;
		case 2:
			valor = 3.50 * quantidade;
			break;
		case 3:
			valor = 4.80 * quantidade;
			break;
		case 4:
			valor = 8.90 * quantidade;
			break;
		case 5:
			valor = 7.32 * quantidade;
			break;
		default:
			System.out.println("Código inválido.");
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", valor);
		
		sc.close();
	}
}

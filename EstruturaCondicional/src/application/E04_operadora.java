package application;

import java.util.Locale;
import java.util.Scanner;

public class E04_operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valorPago;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextInt();
		
		valorPago = 50.00;
		
		if (minutos > 100) {
			valorPago += (minutos - 100) * 2.0;
		}
		
		System.out.printf("Valor a pagar: R$%.2f", valorPago);
		
		sc.close();
	}
}

package application;

import java.util.Scanner;

public class E06_combustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int codigo;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		System.out.print("Informe um c�digo (1, 2, 3) ou 4 para parar: ");
		codigo = sc.nextInt();
		
		while (codigo != 4) {
			if (codigo == 1) {
				alcool++;
			} else if (codigo == 2) {
				gasolina++;
			} else if (codigo == 3) {
				diesel++;
			}
			System.out.print("Informe um c�digo (1, 2, 3) ou 4 para parar: ");
			codigo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("�lcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}
}

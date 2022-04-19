package application;

import java.util.Scanner;

public class E03_menor_de_tres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, menor;
		
		System.out.printf("Primeiro valor: ");
		a = sc.nextInt();
		System.out.printf("Segundo valor: ");
		b = sc.nextInt();
		System.out.printf("Terceiro valor: ");
		c = sc.nextInt();
		
		if (a < b && a < c) {
			menor = a;
		} else if (b < c) {
			menor = b;
		} else {
			menor = c;
		}
		
		System.out.println("MENOR = " + menor);
		
		sc.close();
	}
}

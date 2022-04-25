package application;

import java.util.Scanner;

public class E09_soma_impares {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y, troca;
		int soma = 0;
		
		System.out.println("Digite dois números: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			troca = x;
			x = y;
			y = troca;
		} 
		
		for (int i = x + 1; i < y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		
		System.out.println("SOMA DOS ÍMPARES = " + soma);
		
		sc.close();
	}
}

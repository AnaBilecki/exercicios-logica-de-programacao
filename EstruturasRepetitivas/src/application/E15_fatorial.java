package application;

import java.util.Scanner;

public class E15_fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		int fatorial = 1;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		
		System.out.print("FATORIAL = " + fatorial);
		
		sc.close();
	}
}

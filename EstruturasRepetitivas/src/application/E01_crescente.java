package application;

import java.util.Scanner;

public class E01_crescente {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		
		System.out.println("Digite dois n�meros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != y) {
			if (x > y) {
				System.out.println("DECRESCENTE!");
			} else {
				System.out.println("CRESCENTE!");
			}
			System.out.println("Digite outros dois n�mero:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();

	}
}

package application;

import java.util.Scanner;

public class E04_quadrante {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;
		
		System.out.println("Digite os valores das coordernadas X e Y:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("QUADRANTE 01");
			} else if (x < 0 && y > 0) {
				System.out.println("QUADRANTE 02");
			} else if (x < 0 && y < 0) {
				System.out.println("QUADRANTE 03");
			} else {
				System.out.println("QUADRANTE 04");
			}
			System.out.println("Digite os valores das coordernadas X e Y:");
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}

package application;

import java.util.Scanner;

public class E10_multiplos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite dois n�meros inteiros: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("S�o m�ltiplos");
		} else {
			System.out.println("N�o s�o m�ltiplos");
		}
		
		sc.close();
	}
}

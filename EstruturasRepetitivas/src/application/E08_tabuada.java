package application;

import java.util.Scanner;

public class E08_tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n, produto;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			produto = n * i;
			System.out.println(n + " x " + i + " = " + produto);
		}
		
		sc.close();
	}
}

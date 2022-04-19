package application;

import java.util.Locale;
import java.util.Scanner;

public class E07_dardo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, maior;
		
		System.out.println("Digite as três distâncias: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if (a > b && a > c) {
			maior = a;
		} else if (b > c) {
			maior = b;
		} else {
			maior = c;
		}
		
		System.out.printf("MAIOR DISTÂNCIA = %.2f", maior);
		
		sc.close();
	}
}

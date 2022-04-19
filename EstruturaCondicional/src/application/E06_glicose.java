package application;

import java.util.Locale;
import java.util.Scanner;

public class E06_glicose {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida de glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.print("Classifica��o: normal");
		} else if (glicose <= 140) {
			System.out.print("Classifica��o: elevado");
		} else {
			System.out.print("Classifica��o: diabetes");
		}
		
		sc.close();
	}
}

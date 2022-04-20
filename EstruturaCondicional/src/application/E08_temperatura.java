package application;

import java.util.Locale;
import java.util.Scanner;

public class E08_temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double temperatura, resultado;
		
		System.out.print("Voc� vai digitar a temperatura em qual escala (C/F)? ");
		String opcao = sc.nextLine();
		
		switch (opcao) {
			case "C":
				System.out.print("Digite a temperatura em Celsius: ");
				temperatura = sc.nextDouble();
				resultado = 9.0 * temperatura / 5.0 + 32.0;
				System.out.printf("Temperatura equivalente em Fahrenheit: %.2f", resultado);
				break;
			case "F":
				System.out.print("Digite a temperatura em Fahrenheit: ");
				temperatura = sc.nextDouble(); 
				resultado = 5.0 / 9.0 * (temperatura - 32.0);
				System.out.printf("Temperatura equivalente em Celsius: %.2f", resultado);
				break;
			default:
				System.out.println("A op��o digitada n�o � v�lida");
		}
		
		sc.close();
	}
}

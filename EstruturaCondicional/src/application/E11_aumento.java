package application;

import java.util.Locale;
import java.util.Scanner;

public class E11_aumento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario, salarioNovo;
		int porcentagem;
		
		System.out.print("Digite o salário da pessoa: ");
		salario = sc.nextDouble();
	    
		if (salario <= 1000) {
			porcentagem = 20;
		} else if (salario <= 3000) {
			porcentagem = 15;
		} else if (salario <= 8000) {
			porcentagem = 10;
		} else {
			porcentagem = 5;
		}
		
		salarioNovo = salario * (1 + (porcentagem / 100.0));
		
		System.out.printf("Novo salário = R$ %.2f%n", salarioNovo);
		System.out.printf("Aumento = R$ %.2f%n", salarioNovo - salario);
		System.out.println("Porcentagem = " + porcentagem + " %");
		
		sc.close();
	}
}

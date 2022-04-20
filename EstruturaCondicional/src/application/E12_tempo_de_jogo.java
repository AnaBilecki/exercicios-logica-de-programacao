package application;

import java.util.Scanner;

public class E12_tempo_de_jogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int ti, tf, duracao;
		
		System.out.print("Hora inicial: ");
		ti = sc.nextInt();
		System.out.print("Hora final: ");
		tf = sc.nextInt();
		
		if (ti >= tf ) {
			duracao = (tf + 24) - ti;
		} else {
			duracao = tf - ti;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
	}
}

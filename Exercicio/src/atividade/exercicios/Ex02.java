package atividade.exercicios;

import java.util.Scanner;

public class Ex02 {

	/*
 		Crie um programa que leia dois inteiros e determine 
 		se o primeiro � m�ltiplo do segundo.
	 */


	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);

		System.out.println("Entre com primero valor: (Valores interiros)");
		int x = Integer.parseInt(teclado.nextLine());
		System.out.println("Entre com segundo valor: (Valores interiros)");
		int y = Integer.parseInt(teclado.nextLine());
		multiplo(x, y);
	}

	public static void multiplo(int x, int y) {

		if (x % y == 0) {
			System.out.println(x + "� multiplo de " + y);
		}else {
			System.out.println(x + "n�o � Multiplo" + y);
		}		
	}

}

package atividade.exercicios;

import java.util.Scanner;

public class Ex03 {
	// Crie um programa que leia o raio de um c�rculo e imprima seu di�metro, area e circunferencia.
	//Utilize a contante PI na classe math.

	private static Scanner teclado;


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		teclado = new Scanner(System.in);

		System.out.println("Entre com primero valor do raio de um circulo: (metros) ");
		float raio = Integer.parseInt(teclado.nextLine());
		calcula_circulo(raio);

	}


	public static void calcula_circulo(float raio) {
		float circunferencia, diametro, area;
		System.out.println("Di�metro:" + 2*(raio) + " m");
		System.out.println("Area:" + (Math.PI * Math.pow(raio, 2)) + " m�");
		System.out.println("Circunfer�ncia:"+ (Math.PI*2*(raio))+ " m");
	}
}
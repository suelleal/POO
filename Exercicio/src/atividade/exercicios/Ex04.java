package atividade.exercicios;

import java.util.Scanner;

/*
 * Crie um programa que leia um caractere e o imprima na tela, juntamente com seu c�digo na tabela
 * ASCII, que deve ser determinado em tempo de execu��o
 */
public class Ex04 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		char letra;
		System.out.println("Escreva uma letra e descubra...");
		letra = teclado.nextLine().charAt(0);
		teclado.close();		
		System.out.println(" Letra "+ letra + "\t --- Numero ASCII  " + (int)letra);
	}

}
package atividade.exercicios;

import java.util.Scanner;

public class Ex02_Complementar {

	public static void main(String[] args) {
		String string;
		int tamanho;
		Scanner ler = new Scanner(System.in);
		System.out.print("Por favor, escreva um texto: ");
		string = ler.nextLine();
		ler.close();
		tamanho = string.length();
		System.out.printf("texto digitado: %s \n", string);
		System.out.printf("tamanho do texto: %d \n",tamanho);
		System.out.print("caracteres: \n");
		for(int i=0; i<tamanho; i++) {
			System.out.printf("%s \n",string.charAt(i));
		}
	}
}
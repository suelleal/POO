package atividade.exercicios;

import java.util.Scanner;

public class Ex01_Complementar {

	public static void main(String[] args) {
		String string;
		int tamanho;
		Scanner ler = new Scanner(System.in);
		System.out.print("Por favor, escreva um texto: ");
		string = ler.nextLine();
		ler.close();
		System.out.print("Resultado: \n");
		for(tamanho=string.length();tamanho>0;tamanho--) {
			System.out.println(string);
		}        
	}
}

package atividade.exercicios;

import java.util.Scanner;

public class Ex03_Complementar {

	public static void main(String[] args) {
		String string;
		int tamanho, vogais = 0;
		char cha;

		Scanner ler = new Scanner(System.in);
		System.out.print("Por favor, escreva um texto: ");
		string = ler.nextLine();
		ler.close();
		tamanho = string.length();
		for(int i=0; i<tamanho; i++) {
			cha = string.charAt(i);
			if(cha=='a'||cha=='e'||cha=='i'||cha=='o'||cha=='u') {
				vogais += 1;
			}
		}
		System.out.printf("numero total de caracteres: %d \n", tamanho);
		System.out.printf("numero de vogais: %d \n", vogais);
		System.out.printf("porcentagem das vogais em relação as consoantes: %.2f",(float)(100 * vogais)/tamanho);
	}

}

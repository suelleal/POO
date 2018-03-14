package atividade.exercicios;

import java.util.Scanner;

public class Ex05 {
	/*
	 * Crie umprograma que armazene 12 números em array e 
	 * determine qual a porcentagem de números menores que 8 e 
	 * qual a porcentagem  de números menores que 10.	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x[] = new int [12];
		float menor = 0, maior = 0;

		for(int i = 0; i < 12; i++) {
			System.out.println("Entre com o valor de um numero: ");
			x[i] = scan.nextInt();
			if(x[i] < 8) {
				menor ++;
			}
			if(x[i] > 10) {
				maior ++;
			}
		}
		scan.close();

		System.out.println("Numeros menores que 8: " + (menor / 12)*100 +"%");
		System.out.println("Numeros maiores que 10: " + (maior / 12)*100 + "%");
	}
}
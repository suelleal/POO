package atividade.exercicios;

import java.util.Scanner;

public class Ex04_Complementar {
	
	public static void main(String[] args) {
		int vetor1[] = new int[3], vetor2[] = new int[3], soma1 = 0, soma2 = 0, soma = 0;
		float media1 = 0, media2 = 0, somamedia = 0, mediamedia = 0;
		Scanner ler = new Scanner(System.in);
		for(int i=0; i<6; i++){
			if(i<3) {
				System.out.printf("escreva o nº do vetor 1 na posição [%d]: ", i);
				vetor1[i] = ler.nextInt();
			}else {
				System.out.printf("escreva o nº do vetor 2 na posição [%d]: ", i-3);
				vetor2[i-3] = ler.nextInt();
			}
		}

		for(int i=0; i<6; i++) {
			if(i<3) {
				System.out.printf("%d \n", vetor1[i]);
				soma1 = soma1 + vetor1[i];
			}else {
				System.out.printf("%d \n", vetor2[i-3]);
				soma2 = soma2 + vetor2[i-3];
			}
		}
		soma = soma1 + soma2;
		media1 = (float)soma1/3;
		media2 = (float)soma2/3;
		somamedia = media1 + media2;
		mediamedia = somamedia/2;
		ler.close();
		System.out.printf("A soma dos nº do vetor1 = %d\n", soma1);
		System.out.printf("A media dos nº do vetor1 = %.2f\n", media1);
		System.out.printf("A soma dos nº do vetor2 = %d\n", soma2);
		System.out.printf("A media dos nº do vetor2 = %.2f\n", media2);
		System.out.printf("A soma dos vetores 1 e 2 = %d\n", soma);
		System.out.printf("A soma das medias dos vetores = %.2f\n", somamedia);
		System.out.printf("A media das medias dos vetores = %.2f\n", mediamedia);

	}
}

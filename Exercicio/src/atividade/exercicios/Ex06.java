package atividade.exercicios;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Ex06 {
	/*
	 * Crie um programa que aloque dinamicamente e leia uma matriz 10x10 de caracteres 
	 * e atravez de um método estático, imprima todos os elementos, 
	 * exeto os da diagonal secundaria.
	 */

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);

		int[][] matriz = new int[2][2];
		Vector v = new Vector();

		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz.length; j++)
			{
				matriz[i][j] = new Random().nextInt(100);
			}
		}

		for (int i = 0; i < matriz.length; i++){
			System.out.print("|");
			for (int j = 0; j < matriz[i].length; j++){				
				System.out.println(matriz[i][j]);
				if (j!=matriz[i].length-1) System.out.print("\t");
			}
			System.out.println("|");
		}
		
		for (int i = 0; i < matriz.length; i++){
			System.out.print("|");
			for (int j = 0; j < matriz[i].length; j++){	
				
				if (j == (matriz[i].length - 1 - i )) {
				 //Diagonal Secundaria
				}else {
					for (i = 0; i < matriz.length; i++){
						System.out.print("|");
						for (j = 0; j < matriz[i].length; j++){				
							System.out.println(matriz[i][j]);
							if (j!=matriz[i].length-1) System.out.print("\t");
						}
						System.out.println("|");
					}
					
					
				}

			}

		}
	}


	/*
		for (int i = 1; i < matriz.length; i++)
		{
			for (int j = 0; j < matriz.length - i; j++)
			{
				matriz[j][i+j] = 0;
				v.add(matriz[j][i+j]);
			}
		}
	 */

	//matriz[i][j] = new Random().nextInt(100);



	/*
		for (int i = 1; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length - i; j++)
				//int[] numeros = new int[new Random().nextInt(100)];
				if (j == (3 - 1 - i )) {
					System.out.println("\t" + matriz[i][j]); //Diagonal Secundaria
				}
		}*/
}





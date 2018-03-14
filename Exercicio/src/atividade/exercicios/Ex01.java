package atividade.exercicios;

import java.util.Scanner;

public class Ex01 {
	/*
	 Crie um programa que leia 3 inteiros apartir do teclado e determina:

	  (a) o Maior;
	  (b) o Menor;
	  (c) o produto;
	  (d) a média.

	 */


	private static Scanner teclado;
	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		System.out.println("Entre com primero valor:");
		int x = Integer.parseInt(teclado.nextLine());
		System.out.println("Entre com segundo valor: ");
		int y = Integer.parseInt(teclado.nextLine());
		System.out.println("Entre com terceiro valor: ");
		int z = Integer.parseInt(teclado.nextLine());
		System.out.println("O maior entre "+ x +","+ y +" e "+ z +" : " + maior(x,y,z));
		System.out.println("O menor entre "+ x +","+ y +" e "+ z +" é " + menor(x,y,z));
		System.out.println("O produto de: "+ x +"x"+ y +"x"+ z +" = " + (x*y*z));
		System.out.println("O média de: "+ x +","+ y +" e "+ z +" = " + (x+y+z)/3);
	}

	public static int maior(int x, int y, int z ) {
		int maior = 0;
		if ( x > y && x > z) {
			maior = x;
		} else if ( y > x && y > z) {
			maior = y;
		}else { 
			maior = z;
		}
		return maior;

	}
	public static int menor(int x, int y, int z ) {
		int menor = 0;
		if ( x < y && x < z) {
			menor = x; 
		} else if ( y < x && y < z) {
			menor = y; 
		}else{
			menor = z; 
		}
		return menor;
	}

}
package com.dam.quique;

import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {

		/*Realiza un programa que lea cinco números desde teclado y muestre la suma por pantalla.
			Sugerencia: utilizar una estructura de bucle.*/
		
		Scanner teclado = new Scanner (System.in);

		int num=0;
		
		int suma=0;
		
		
		
		for( int i = 0; i <5;i++) {
			
			System.out.println("Dime un número");
			suma = suma+teclado.nextInt();
			System.out.println(suma);
		}
		
	}

}

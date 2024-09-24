package com.dam.quique;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		// Realiza un programa que lea dos números desde teclado y muestre la suma por pantalla.
		
		Scanner teclado = new Scanner (System.in);

		int num1=0;
		int num2=0;
		int suma;
		
		System.out.println("Hola dime un número:");
		num1=teclado.nextInt();
		
		System.out.println("Hola dime otro número:");
		num2=teclado.nextInt();
		
		suma = num1+num2;
		
		System.out.println("El resultado es : " + suma);
	}

}

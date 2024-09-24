package com.dam.quique;

import java.util.Scanner;

public class Main13 {

	public static void main(String[] args) {
			
		
		/*
		 * Programa que lea un valor de grados centígrados desde teclado y lo muestre en grados
			Fahrenheit con una precisión de 1 decimal*/
		
		
		Scanner teclado = new Scanner ( System.in);
		
		Double celsius;
		Double fahrenheit;
		
		
			
		System.out.println("Introduce la temperatura en grados Celsius:");
	    celsius = teclado.nextDouble();
		
	    fahrenheit = (celsius * 9/5) + 32;
	    
	    
        System.out.printf("La temperatura en grados Fahrenheit es: %.1f°F\n", fahrenheit);

	}

}

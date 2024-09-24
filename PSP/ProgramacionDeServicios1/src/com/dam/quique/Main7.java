package com.dam.quique;

import java.util.Scanner;

public class Main7 {

	public static void main(String[] args) {
		//7. Resolver el ejercicio anterior empleando otra estructura de bucle.

		
		Scanner teclado = new Scanner (System.in);

		int suma=0;
		int contador=0;
		
		while(contador<5) {
			
			System.out.println("Dime un número");
			suma = suma+teclado.nextInt();
			System.out.println(suma);
			contador++;
			
		}
	}

}

package com.dam.quique;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		//Programa Java que lea un nombre desde teclado y muestre por pantalla un mensaje tipo
		//“Hola xxxxx”
		
		Scanner teclado = new Scanner ( System.in);
		
		String nombre;
		
		System.out.println("Dime tu nombre");
		nombre= teclado.nextLine();
		
		
		System.out.println("Hola "+ nombre);
		
		
	}

}

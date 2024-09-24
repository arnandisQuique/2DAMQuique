package com.dam.quique;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		/*
		 *  Realiza un programa que lea dos números desde teclado en un bucle repetitivo. El bucle
			deberá finalizar cuando los números leídos sean iguales.*/
		
		Scanner teclado = new Scanner (System.in);

		int num1=0;
		int num2=0;
		
		System.out.println("voy a preguntarte numeros hasta que me digas los dos iguales");
		System.out.println();
		
		do {
			
			System.out.println("Hola dime un número:");
			num1=teclado.nextInt();
			
			System.out.println("Hola dime otro número:");
			num2=teclado.nextInt();
			
			
				
		}while(num1!=num2);
		
		

		System.out.println("Has salido del programa ya que has puesto dos números iguales");
		
	}

}

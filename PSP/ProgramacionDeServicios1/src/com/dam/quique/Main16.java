package com.dam.quique;

import java.util.Date;
import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner ( System.in);
		
		int dia ;
		int mes;
		int anio;
		int suma =0;
		
		
		
		System.out.println("Dime tu fecha de nacimiento y te digo tu numero de la suerte");
		System.out.println("Dime el dia");
		dia = teclado.nextInt();
		
		System.out.println("Dime el mes");
		mes = teclado.nextInt();
		
		System.out.println("Dime el año");
		anio = teclado.nextInt();
		
		
		suma = dia +mes+anio;
		
		while (suma > 9) {
            suma = suma / 10 + suma % 10;
        }
			
			
		System.out.println("Tu numero de la suerte es : "+ suma);
		
		
		
	}

}

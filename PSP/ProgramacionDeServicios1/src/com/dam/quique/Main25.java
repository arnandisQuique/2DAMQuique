package com.dam.quique;

import java.util.Random;
import java.util.Scanner;

public class Main25 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num1 ;
		int num2 ;
		int num3 ;
		
		System.out.println("Introduce un numero del 1 al 10");
		num1 =teclado.nextInt();
		
		System.out.println("Ahora del segundo");
		num2 =teclado.nextInt();

		System.out.println("Ahora del tercero");
		num3 =teclado.nextInt();
		
		if( num1 > 0   ||  num1 <= 10  || num2 > 0   ||  num2 <= 10  || num3 > 0   ||  num3 <= 10  ) {
			
		Random random = new Random();
		int randomm = random.nextInt(10) + 1;
		
			
		System.out.println("Número ingresado: " + num1);
        System.out.println("Número aleatorio: " + randomm);
			
        
        if (num1 == randomm || num2 == randomm || num3 == randomm) {
            System.out.println("Los nums coinciden");
        } 
        
        else {
            System.out.println("Lo siento, no coinciden. Intentalo de nuevo.");
        }
        
		}
		else {
			System.out.println("El numero no esta en el rango que necesita");	
			return;
		
			}
		
		
	}

}

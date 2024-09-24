package com.dam.quique;

import java.util.Random;
import java.util.Scanner;

public class Main24 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int num ;
		System.out.println("Introduce un numero del 1 al 10");
		num =teclado.nextInt();
		
		
		if( num > 0   ||  num < 10 ) {
			
		Random random = new Random();
		int randomm = random.nextInt(10) + 1;
			
		System.out.println("Número ingresado: " + num);
        System.out.println("Número aleatorio: " + randomm);
			
        
        if (num == randomm) {
            System.out.println("Los num coinciden");
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

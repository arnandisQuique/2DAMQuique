package com.dam.quique;

import java.util.Scanner;

public class Main21 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		String[] nombres = new String[5];
		String nombre="";
		
		
		System.out.println("Dime 5 nombres");
		for(int i = 0; i <5;i++) {
			System.out.println("Dime el nombre número "+i);
			nombre=teclado.nextLine();
			nombres[i] = nombre;
		}

		for(int i = 0; i <5;i++) {
			System.out.println(nombres[i]);
			
		}
		
	
	}

}

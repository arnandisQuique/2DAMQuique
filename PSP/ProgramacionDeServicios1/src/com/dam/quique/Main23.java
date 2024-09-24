package com.dam.quique;

import java.util.ArrayList;
import java.util.Scanner;

public class Main23 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		Integer numero= 0;
		int cerrar=1;
		String nombre="";
		ArrayList<String> nombres= new ArrayList<String>();
		
		
		do {
		System.out.println("Dime el nombre número ");
		nombre=teclado.nextLine();
		nombres.add(nombre);
			
	
		System.out.println("¿Quieres volver a introducir otro nombres?");
		System.out.println("0)N0");
		System.out.println("1)SI");
		cerrar=teclado.nextInt();
		teclado.nextLine();
		
		}while(cerrar == 1);
	
		System.out.println(nombres);
		for( int i = 0; i < nombres.size();i++) {
			System.out.println("El nombre número " + i+" :");
			System.out.println(nombres.get(i));
			
		}
		
	}

}

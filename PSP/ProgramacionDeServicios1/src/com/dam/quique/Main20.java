package com.dam.quique;

public class Main20 {

	public static void main(String[] args) {
		
		
		
		System.out.println("Tabla de caracteres ASCII:");

		for (int i = 32; i <= 126; i++) {
			System.out.println("ASCII " + i + ": " + (char)i);
		}
		System.out.println();
		
        System.out.println("Tabla de caracteres ASCII extendidos:");

		 for (int i = 128; i <= 255; i++) {
	            System.out.println("ASCII " + i + ": " + (char)i);
	    }

	}

}

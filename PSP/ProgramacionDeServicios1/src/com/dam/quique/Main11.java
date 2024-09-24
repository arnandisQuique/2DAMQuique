package com.dam.quique;

import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner ( System.in);
		int DNI;
		int resto;
		char letra;
		
		
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Introduce el número del DNI (Sin letra)");
		DNI= teclado.nextInt();
		
		
		resto = DNI % 23;
		letra = letras[resto];
		
        System.out.println("El DNI completo es: " + DNI + letra);

	}

}

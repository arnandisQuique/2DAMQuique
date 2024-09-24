package com.dam.quique;

import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {
		// Desarrolla un programa que lea el valor del radio de una circunferencia y devuelva por
		//pantalla el diámetro y el área con una precisión de 3 decimales.


		
		Scanner teclado = new Scanner(System.in);
		double radio=0;
		double diametro=0;
		double area=0;
		
		System.out.println("Dime el radio de una circunferencia y te digo el diametro y el area");
		radio = teclado.nextDouble();
		
		diametro = radio *2;
		
		System.out.println("El diametro es: "+ diametro);
		
		area= 3.14*radio *radio;
		
		System.out.println("El area es: "+ area);
		
		
	}

}

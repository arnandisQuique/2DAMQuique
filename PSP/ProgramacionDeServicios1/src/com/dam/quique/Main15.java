package com.dam.quique;

import java.util.Scanner;

public class Main15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner(System.in);
		double radio=0;
		double diametro=0;
		double area=0;
		double volumen=0;
		
		
		System.out.println("Dime el radio de una circunferencia y te digo el diametro y el area");
		radio = teclado.nextDouble();
		
		diametro = radio *2;
		System.out.println("El diametro es: "+ diametro);
		
		area= 3.14*radio *radio;
		System.out.println("El area es: "+ area);
		
		volumen = (4/3) * 3.14*radio*radio*radio;	
		System.out.println("El volumen es : "+ volumen);
		
		
	}

}

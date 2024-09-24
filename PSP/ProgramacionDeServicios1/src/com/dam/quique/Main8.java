package com.dam.quique;

import java.util.Scanner;

public class Main8 {

	public static void main(String[] args) {
		/*
		 * 	Desarrolla un programa que lea por teclado un número del 1 al 12 e indique por pantalla a
			qué mes del año en texto corresponde. Sugerencia: utilizar una estructura de programación
			if … else*/
		
		Scanner teclado = new Scanner ( System.in);
		
		int num;
		
		System.out.println("Dime un numero y te digo su mes del año");
		num=teclado.nextInt();
		
		if(num==1) {
			System.out.println("Tu mes es Enero");
		}

		if(num==2) {
			System.out.println("Tu mes es Febrero");

		}
		if(num==3) {
			System.out.println("Tu mes es Marzo");

		}
		if(num==4) {
			System.out.println("Tu mes es Abril");

		}
		if(num==5) {
			System.out.println("Tu mes es Mayo");

		}
		if(num==6) {
			System.out.println("Tu mes es Junio");

		}
		if(num==7) {
			System.out.println("Tu mes es Julio");

		}
		if(num==8) {
			System.out.println("Tu mes es Agosto");

		}
		if(num==9) {
			System.out.println("Tu mes es Septiembre");

		}
		if(num==10) {
			System.out.println("Tu mes es Octubre");

		}
		if(num==11) {
			System.out.println("Tu mes es Noviembre");

		}
		if(num==12) {
			System.out.println("Tu mes es Diciembre");

		}

	}

}

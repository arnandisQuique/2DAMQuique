package com.dam.quique;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
			/* . Programa que lea dos números desde teclado y muestre el menor y el mayor en pantalla. Si
			son iguales deberá mostrar un mensaje indicándolo.*/
		
		Scanner teclado = new Scanner (System.in);

		int num1=0;
		int num2=0;
		int numMax;
		int numMin;
		
		System.out.println("Hola dime un número:");
		num1=teclado.nextInt();
		
		System.out.println("Hola dime otro número:");
		num2=teclado.nextInt();
		
		
		if( num1 > num2) {
			numMax = num1;
			numMin = num2;
			
			System.out.println("El número mayor es: " + numMax);
			System.out.println("El número menor es: " + numMin);

		}
		if(num2 > num1) {
			numMax= num2;
			numMin= num1;
			System.out.println("El número mayor es: " + numMax);
			System.out.println("El número menor es: " + numMin);
		}
		if( num1== num2) {
			System.out.println("Los dos números son iguales");
		}
		
		

	}

}

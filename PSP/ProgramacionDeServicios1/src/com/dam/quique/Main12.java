package com.dam.quique;

import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		/* 
		 * . Realiza un programa en Java que dadas 10 notas introducidas por teclado (valores de 0 a
			10), las agrupe en suspensos, aprobados, notables, sobresalientes y matrícula, y muestre
			por pantalla cuantas notas hay en cada grupo.*/
		
		
		Scanner teclado = new Scanner(System.in);
		
		int nota=0;
		int suspensos=0;
		int aprovados=0;
		int notables=0;
		int sobresalientes=0;
		int matricula=0;
		
		
		System.out.println("Te voy a preguntar 10 notas");
		
		
		for ( int i = 0; i < 10; i++) {
			
			System.out.println("dime la nota número : "+ i);
			nota = teclado.nextInt();
			
			if(nota < 5 ) {
				suspensos++;
			}
			if(nota >= 5 ) {
				aprovados++;
			}
			if(nota >= 7  && nota <9) {
				notables++;
			}
			if( nota == 9 ) {
				sobresalientes++;
			}
			if(nota ==10) {
				matricula++;
			}
			
		}
		
		System.out.println("Hay " + suspensos+ " suspensos");
		System.out.println("Hay " + aprovados+ " aprovados");
		System.out.println("Hay " + notables+ " notables");
		System.out.println("Hay " + sobresalientes+ " sobresalientes");
		System.out.println("Hay " + matricula+ " matricula");

		

	}

}

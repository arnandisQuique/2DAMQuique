package com.dam.quique;

import java.util.Scanner;

public class Main29 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int vehiculo = 0;

		System.out.println("Introduzca la cantidad de vehiculos que quiere crear:");

		vehiculo = teclado.nextInt();

		

		Vehiculos[] vehiculos = new Vehiculos[vehiculo];

		

		 for (int i = 0; i < vehiculos.length; i++){

			 	teclado.nextLine();
	            System.out.println("Introduzca los datos del vehículo " + (i + 1) + ":");

	            System.out.print("Introduzca el tipo del vehiculo:");
	            String tipo = teclado.nextLine();

	            

	            System.out.print("Introduzca la marca: ");
	            String marca = teclado.nextLine();

	            

	            System.out.print("Introduzca el modelo: ");
	            String modelo = teclado.nextLine();

	            

	            System.out.println("Introduzca el motor:");
	            String motor = teclado.nextLine();

	            vehiculos[i] = new Vehiculos(tipo, marca, modelo,motor);

	        }

		 System.out.println("Informacion de los vehiculos creados:");

	        for (Vehiculos v : vehiculos) 

	        {

	            System.out.println(v.toString());

	        }}

}

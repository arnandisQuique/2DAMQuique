package com.dam.quique;

import java.util.Scanner;

public class Main26 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int suspenso = 0;
		int aprobado = 0;
		int notable = 0;
		int sobresaliente = 0;
		int matricula = 0;
		int nota = 0;
		int[] notas = new int[10];
		for(int i = 0; i <= notas.length; i++){

			System.out.println("Introduzca en el sistema 10 notas y las clasificaremos en diferente sectores.");
			nota = teclado.nextInt();
			notas[i] = nota;
			String grupo = determineGrupo(nota);

			  switch (grupo){

             case "suspenso":
                 suspenso++;
                 break;

             case "aprobado":
                 aprobado++;
                 break;

             case "notable":
                 notable++;
                 break;

             case "sobresaliente":
                 sobresaliente++;
                 break;

             case "matricula":
                 matricula++;
                 break;
                 
			 }		
	}
}

	public static String determineGrupo(int nota){

		if (nota >= 0 && nota < 5){

        return "suspenso";
        } 

		else if (nota >= 5 && nota < 7){
            return "aprobado";
        } 

		else if (nota >= 7 && nota < 9){
            return "notable";
        } 

		else if (nota >= 9 && nota < 10){
            return "sobresaliente";
        } 

		else if (nota == 10){
            return "matricula";
        }

		

		return "";

	}

	

	

	}



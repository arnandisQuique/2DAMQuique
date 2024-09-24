package com.dam.quique;

import java.util.Scanner;

public class Main18 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		String contra = "";
		Boolean comprovaciónCaracteres = false;
		Boolean comprovacionNumeros =false;
		Boolean comprovacionMayuscula =false;
		Boolean comprovar= false;
		
		
		do {
			
		System.out.println("HOla, introduce una contraseña.");
		System.out.println("Tiene que tener al menos 5 carácteres, 1 número y 1 letra mayuscula");
		contra=teclado.nextLine();
		
		
		if(contra.length() >= 5) {
		
			comprovaciónCaracteres= true;
		}
		
		if( contra.matches(".*\\d.*")) {
			comprovacionNumeros= true;
		}
		
		if( contra.matches(".*[A-Z].*")) {
			comprovacionMayuscula= true;
		}
		
		if(comprovacionMayuscula==true && comprovacionNumeros==true && comprovaciónCaracteres==true) {
			System.out.println("Tu contraseña tiene lo que hace falta");
			comprovar=true;
		}
		else{
		System.out.println("A tu contraseña le falta algo");
		System.out.println();
		}
		}while(comprovar== false);
		
	}

}

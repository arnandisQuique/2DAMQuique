package com.dam.quique;

import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Dime un numero y te digo su mes del año");
        num = teclado.nextInt();

        switch (num) {
            case 1:
                System.out.println("Tu mes es Enero");
                break;
            case 2:
                System.out.println("Tu mes es Febrero");
                break;
            case 3:
                System.out.println("Tu mes es Marzo");
                break;
            case 4:
                System.out.println("Tu mes es Abril");
                break;
            case 5:
                System.out.println("Tu mes es Mayo");
                break;
            case 6:
                System.out.println("Tu mes es Junio");
                break;
            case 7:
                System.out.println("Tu mes es Julio");
                break;
            case 8:
                System.out.println("Tu mes es Agosto");
                break;
            case 9:
                System.out.println("Tu mes es Septiembre");
                break;
            case 10:
                System.out.println("Tu mes es Octubre");
                break;
            case 11:
                System.out.println("Tu mes es Noviembre");
                break;
            case 12:
                System.out.println("Tu mes es Diciembre");
                break;
            default:
                System.out.println("Número no válido. Debes introducir un número del 1 al 12.");
        }

	}

}

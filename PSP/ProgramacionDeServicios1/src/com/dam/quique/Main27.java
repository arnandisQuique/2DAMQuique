package com.dam.quique;

import java.util.Scanner;

public class Main27 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int DNI = 0;
        String letra;

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Introduce el número del DNI (sin letra):");
        DNI = teclado.nextInt();
        
        letra = LetraDNI(DNI, letras);

        System.out.println("El DNI completo es: " + DNI + letra);

    }

    public static String LetraDNI(int DNI, char[] letras) {
        int resto = DNI % 23;
        
        return String.valueOf(letras[resto]);
    }
}


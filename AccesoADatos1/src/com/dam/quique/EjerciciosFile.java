package com.dam.quique;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjerciciosFile {

	public static void main(String[] args) {

		Scanner teclado = new Scanner ( System.in);
		String nombre = "";
			
		System.out.println("Hola, dime un directorio y te lo muestro de vuelta");
		nombre = teclado.nextLine();
		
		File directorio = new File(nombre);

		System.out.println(directorio.getName());
		
		
	}
	
	
	
	public static void ejercicio2(String[] args){
		Scanner teclado = new Scanner ( System.in);
		String nombre = "";
			
		System.out.println("Hola, dime un directorio y te lo muestro de vuelta");
		nombre = teclado.nextLine();
		
		File directorio = new File(nombre);

		System.out.println(directorio.exists());
		System.out.println(directorio.isAbsolute());
		System.out.println(directorio.isDirectory());
		System.out.println(directorio.isFile());
		System.out.println(directorio.canExecute());
		System.out.println(directorio.canWrite());
		System.out.println(directorio.canRead());
	
		
	}
	
	public static void ejercicio3(String[] args){
		
		Scanner teclado = new Scanner ( System.in);
		String nombre = "";
			
		System.out.println("Hola, dime un directorio ");
		nombre = teclado.nextLine();
		
		File directorio = new File(nombre);
		
		if( directorio.exists()==true) {
			System.out.println("EL directorio si que existe");
		}
		else {
			System.out.println("El directorio no existe");
		}
		
		
	}
	
	public static void ejercicio5(String[] args){
		Scanner teclado = new Scanner ( System.in);
		String nombre = "";
			
		System.out.println("Hola, dime un directorio");
		nombre = teclado.nextLine();
		
		System.out.println("Ahora dime una extensión de un fichero");
		String extension = teclado.nextLine();
		
			
		File directorio = new File(nombre);
		
		if (!extension.startsWith(".")) {
            System.out.println("La extensión debe comenzar con un punto (por ejemplo, .png).");
            return;
        }

		
		
		 FilenameFilter filtro = new FilenameFilter() {
	            @Override
	            public boolean accept(File dir, String nombre) {
	                return nombre.toLowerCase().endsWith(extension.toLowerCase());
	            }
	     };
		
	     
	     String[] archivos = directorio.list(filtro);
	        
	     System.out.println("Archivos con la extensión " + extension + " en el directorio " + nombre + ":");
	        for (String archivo : archivos) {
	            System.out.println(archivo);
	        }  
	        
		
		
	}
	
	
	public static void ejercicio6(String[] args){
		Scanner teclado = new Scanner ( System.in);
		String nombre = "";
			
		System.out.println("Hola, dime un directorio");
		nombre = teclado.nextLine();
		
		System.out.println("Ahora dime una extensión de un fichero");
		String extension = teclado.nextLine();
		
			
		File directorio = new File(nombre);
		
		if (!extension.startsWith(".")) {
            System.out.println("La extensión debe comenzar con un punto (por ejemplo, .png).");
            return;
        }

		
		
		 FilenameFilter filtro = new FilenameFilter() {
	            @Override
	            public boolean accept(File dir, String nombre) {
	                return nombre.toLowerCase().endsWith(extension.toLowerCase());
	            }
	     };
		
	     
	     String[] archivos = directorio.list(filtro);
	     String[] listasinextension = directorio.list();

	     if (archivos == null) {
	    	 
	            System.out.println("No hay ninguna extensión de ese tipo.");
	            for ( String lista : listasinextension) {
	            	System.out.println(lista);
	            }
	        }
	        
	     
	     
	     System.out.println("Archivos con la extensión " + extension + " en el directorio " + nombre + ":");
	        for (String archivo : archivos) {
	            System.out.println(archivo);
	        }  
	        
		
		
	}
	
	public static void ejercicio7 (String[] args){

		
		Scanner teclado = new Scanner(System.in);

	        System.out.println("Hola, dime un directorio:");
	        String nombreDirectorio = teclado.nextLine();

	        System.out.println("Dime el número de extensiones que quieres poner:");
	        int nExt = teclado.nextInt();
	        teclado.nextLine(); 

	        ArrayList<String> extensiones = new ArrayList<>();

	        for (int i = 0; i < nExt; i++) {
	            System.out.println("Introduce la extensión " + (i + 1) + ":");
	            extensiones.add(teclado.nextLine());
	        }

	        File directorio = new File(nombreDirectorio);

	        FilenameFilter filtro = new FilenameFilter() {
	            @Override
	            public boolean accept(File dir, String nombreArchivo) {
	                for (String extension : extensiones) {
	                    if (nombreArchivo.toLowerCase().endsWith(extension.toLowerCase())) {
	                        return true;
	                    }
	                }
	                return false;
	            }
	        };

	        String[] archivosFiltrados = directorio.list(filtro);
	        String[] archivosSinFiltro = directorio.list(); 

	        if (archivosFiltrados == null || archivosFiltrados.length == 0) {
	            System.out.println("No se encontraron archivos con las extensiones especificadas.");
	            System.out.println("Archivos disponibles en el directorio:");
	            if (archivosSinFiltro != null) {
	                for (String archivo : archivosSinFiltro) {
	                    System.out.println(archivo);
	                }
	            }
	        } else {
	            System.out.println("Archivos con las extensiones especificadas en el directorio " + nombreDirectorio + ":");
	            for (String archivo : archivosFiltrados) {
	                System.out.println(archivo);
	            }
	        }
	}
	
	
	public static void ejercicio8 (String[] args){
		
		Scanner teclado = new Scanner ( System.in);
		String archivoOriginal = "";
		String archivoNuevo = "";

		System.out.println("Hola, dime un archivo de este directorio");
		archivoOriginal = teclado.nextLine();
		
		
		System.out.println("Hola, dime un archivo nuevo");
		archivoNuevo = teclado.nextLine();
				
		
		 try (
		            BufferedReader leer = new BufferedReader(new FileReader(archivoOriginal));
		            
		            BufferedWriter esribir = new BufferedWriter(new FileWriter(archivoNuevo));
		        ) {
		            String linea;
		            

		            while ((linea = leer.readLine()) != null) {

		            System.out.println(linea);

		                esribir.write(linea);
		                esribir.newLine();  
		            }
		            
		            System.out.println("Copia completada.");
		        } catch (IOException e) {
		            System.out.println("Ocurrió un error: " + e.getMessage());
		            e.printStackTrace();
		        }
		
	}
}

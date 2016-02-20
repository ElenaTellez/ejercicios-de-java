package pruebaFunciones.java;

import java.util.Scanner;

import matematicas.funciones;

/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: 3. potencia: Dada una base y un exponente devuelve la potencia.
*
* @param base un numero entero 
* @param exponente un numero entero
* @return la potencia de un numero
*/
public class potencia {
	
	public static void main(String[] args) {
    
   
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("Introduzca un numero entero positivo: ");
		
		 	
		int base = sc.nextInt();
		
		System.out.print("Introduzca el exponente de la potencia positivo: ");
		
	 	
		int exponente = sc.nextInt();
		
		System.out.println("El numero elevado a la potencia es: " + matematicas.funciones.potencia(base, exponente));
		
		sc.close();	

	}
}
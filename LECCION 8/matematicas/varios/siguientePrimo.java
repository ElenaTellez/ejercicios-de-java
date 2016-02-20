package pruebaFunciones.java;

import matematicas.funciones;

import java.util.Scanner;

/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: 3. siguientePrimo: Devuelve verdadero si el numero que se pasa como parametro
* es primo y falso en caso contrario. Un numero es primo cuando unicamente es divisible entre el 
* mismo y la unidad.
*
* @author Elena Tellez
*/

public class siguientePrimo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero positivo: ");
		
		 	
		int n = sc.nextInt();
		
		System.out.println("El siguiente número Primo al introducido es: " + matematicas.funciones.siguientePrimo(n));
		
		sc.close();	

	}
}

package pruebaFunciones.java;

import matematicas.funciones;

import java.util.Scanner;

/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
* es primo y falso en caso contrario. Un numero es primo cuando unicamente 
* es divisible entre el mismo y la unidad.
*
* @author Elena Tellez
*/

public class esPrimo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero positivo: ");
		
		 	
		int n = sc.nextInt();
		
		if (matematicas.funciones.esPrimo(n)) {
			System.out.println("El " + n + " es primo.");
			} else {
		System.out.println("El " + n + " no es primo.");
		
		sc.close();	

		}
	}
}	

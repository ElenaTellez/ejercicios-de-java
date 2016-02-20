package pruebaFunciones;

import matematicas.Funciones;

import java.util.Scanner;

/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro
* es capicúa y falso en caso contrario.
*
* @author Elena Tellez
*/
 
public class esCapicua {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero positivo: ");
		
		 	
		int numero = sc.nextInt();
		
		 
                System.out.println(matematicas.Funciones.esCapicua(numero));
			
		sc.close();	

	 
	}
}

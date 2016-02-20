package pruebaFunciones.java;

import matematicas.funciones;

import java.util.Scanner;


/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14:11. pegaPorDetras: Añade un digito a un numero por detras.
*
* @author Elena Tellez
*/
 


public class pegaPorDetras {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero positivo: ");
		
		 	
		long numero = sc.nextLong();
		
		System.out.print("Introduzca el digitos que desee pegar por detras: ");
		
		int digito = sc.nextInt();
		 
		System.out.println("El numero resultante es: " + pegaPorDetras(numero,digito));
			
		sc.close();	
	
	}



}
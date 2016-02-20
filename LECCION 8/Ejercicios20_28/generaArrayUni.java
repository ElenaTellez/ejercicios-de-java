package pruebaArrayUni;

import matematicas.funcionesUni;

import java.util.Scanner;

/**
* 
* Ejercicios 20-28: Crea una biblioteca de funciones para arrays (de una dimensión) de números
* enteros que contenga las siguientes funciones:
* 
* 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
* cuyo intervalo (mínimo y máximo) se indica como parámetro.
* 
* @author Elena Tellez
* 
*/



public class generaArrayUni {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		

		System.out.print("Introduzca un número entero positivo: ");		
	
		int tam = sc.nextInt();
		
		System.out.print("Introduzca un número entero positivo: ");		
		 	
		int min = sc.nextInt();
		
		System.out.print("Introduzca otro número entero positivo: ");		
	 	
		int max = sc.nextInt();	
		 
		matematicas.funcionesUni.generaArrayUni(arrayUni);
			 
		
		sc.close();	

		}
	}
	

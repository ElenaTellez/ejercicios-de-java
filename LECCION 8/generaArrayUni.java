package pruebaArrayUni;

import matematicas.funcionesUni;

import java.util.Scanner;

/**
* 
* Ejercicios 20-28: Crea una biblioteca de funciones para arrays (de una dimensi�n) de n�meros
* enteros que contenga las siguientes funciones:
* 
* 1. generaArrayInt: Genera un array de tama�o n con n�meros aleatorios
* cuyo intervalo (m�nimo y m�ximo) se indica como par�metro.
* 
* @author Elena Tellez
* 
*/



public class generaArrayUni {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		

		System.out.print("Introduzca un n�mero entero positivo: ");		
	
		int tam = sc.nextInt();
		
		System.out.print("Introduzca un n�mero entero positivo: ");		
		 	
		int min = sc.nextInt();
		
		System.out.print("Introduzca otro n�mero entero positivo: ");		
	 	
		int max = sc.nextInt();	
		 
		matematicas.funcionesUni.generaArrayUni(arrayUni);
			 
		
		sc.close();	

		}
	}
	

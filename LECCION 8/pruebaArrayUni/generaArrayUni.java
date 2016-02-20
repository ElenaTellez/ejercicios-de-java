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
	
    System.out.print("Introduzca el tamaño del array: ");		
	
		int tam = sc.nextInt();
		
		System.out.print("Introduzca el numero minimo del intervalo del array: ");		
		 	
		int min = sc.nextInt();
		
		System.out.print("Introduzca el numero máxmimo del intervalo del array: ");
    
		int max = sc.nextInt();	
		 
		int[] a = matematicas.funcionesUni.generaArrayUni(tam,min,max);
     
    //El array me lo crea una funcion. Array aleatorio
    
    matematicas.funcionesUni.muestraArrayInt(a);
                
    // La funcion muestraArray me muestra el array generado con la otra funcion
			 
		
		sc.close();	

		}
	}
	

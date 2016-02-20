package pruebaArrayUni;

import matematicas.funcionesUni;

import java.util.Scanner;

/**
* 
* Ejercicios 20-28: Crea una biblioteca de funciones para arrays (de una dimensi�n) de n�meros
* enteros que contenga las siguientes funciones:
* 
*3. maximoArrayInt: Devuelve el máximo del array que se pasa como
* parámetro.
* 
* @author Elena Tellez
* 
*/
public class maximoArray {
  
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
  
  System.out.print("El numero mayor del array es: " + matematicas.funcionesUni.maximoArray(a));	
  		
  // La funcion minimoArray me muestra el valor maximo del array array generado con la otra funcion
	
  sc.close();	
  }
}
  


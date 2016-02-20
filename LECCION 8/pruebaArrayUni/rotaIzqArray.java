package pruebaArrayUni;

import matematicas.funcionesUni;

import java.util.Scanner;

/**
* 
* Ejercicios 20-28: Crea una biblioteca de funciones para arrays (de una dimension)
* de numeros enteros que contenga las siguientes funciones:
* 
* 9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de
* un array.
* 
* @author Elena Tellez  
*/

public class rotaIzqArray {
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca el tamaño del array: ");		
	
	int tam = sc.nextInt();
		
	System.out.print("Introduzca el numero minimo del intervalo del array: ");		
		 	
	int min = sc.nextInt();
		
	System.out.println("Introduzca el numero máximo del intervalo del array: ");		
	 	
	int max = sc.nextInt();	
		 
	int[] a = matematicas.funcionesUni.generaArrayUni(tam,min,max);
     
  //El array me lo crea una funcion. Array aleatorio
    
  matematicas.funcionesUni.muestraArrayInt(a);
                
  // La funcion muestraArray me muestra el array generado con la otra funcion
  
  System.out.println("la media del array es: " + matematicas.funcionesUni.mediaArray(a));	
  		
  // La funcion mediaArray me muestra la media de los valores del array array generado con la otra funcion
	
  
  System.out.println("Introduzca el numero de veces que van a rotar "
    + "a la derecha  ya la izquierda la posicion del array: ");		
	 	
	int cambia = sc.nextInt();	
  
  matematicas.funcionesUni.muestraArrayInt(matematicas.funcionesUni.rotaDchaArray(a, cambia));
  matematicas.funcionesUni.muestraArrayInt(matematicas.funcionesUni.rotaIzqArray(a, cambia));
  
  sc.close();	
  } 
}
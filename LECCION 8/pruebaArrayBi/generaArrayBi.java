package pruebaArrayBi;

import java.util.Scanner;

import matematicas.funcionesBi;

/**
 * Ejercicio 29-34
 * Crea una biblioteca de funciones para arrays bidimensionales (de dos dimen-
 * siones) de números enteros que contenga las siguientes funciones:
 * 
 * @author Elena Tellez
 */
public class generaArrayBi {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca el numero de filas del array: ");		
	
	int filas = sc.nextInt();
		
	System.out.print("Introduzca el numero de columnas del array: ");		
		 	
	int columnas = sc.nextInt();
  
  System.out.print("Introduzca el numero minimo del intervalo del array: ");		
		 	
	int min = sc.nextInt();
		
	System.out.print("Introduzca el numero máximo del intervalo del array: ");		
	 	
	int max = sc.nextInt();	
  
  int a [][] = matematicas.funcionesBi.generaArrayBi(filas,columnas, min, max);
  
  matematicas.funcionesBi.muestraArrayBi(a, filas, columnas);
  
   sc.close();	
  } 
}
  

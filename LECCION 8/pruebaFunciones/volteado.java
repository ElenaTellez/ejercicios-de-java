/**
* Funciones matemáticas de propósito general
* 
* Ejercicios 1 - 14: 6. voltea: Le da la vuelta a un número.
*
* @author Elena Tellez
*/
package pruebaFunciones.java;

import matematicas.funciones;

import java.util.Scanner;

public class volteado {
    public static void main(String[] args) {
    
   
    Scanner sc = new Scanner(System.in);		
		
		
    System.out.print("Introduzca un numero entero positivo: ");
		
		 	
    int x = sc.nextInt();
    
    
    System.out.print(matematicas.Funciones.voltea(x));
		
    sc.close();	    

 }  
}
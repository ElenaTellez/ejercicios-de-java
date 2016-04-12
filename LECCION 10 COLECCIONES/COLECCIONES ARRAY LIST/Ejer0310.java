/**
 * Ejercicio 3
 * 
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList .
 * 
 * @author Elena Tellez
 */

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejer0310 {
  public static void main(String[] args) {
	  
		Scanner s = new Scanner(System.in);

    ArrayList<Integer> a = new ArrayList<Integer>();

		
    System.out.print("Por favor introduce un numero: ");
    
    for (int i = 0; i < 10; i++) {
			a.add(Integer.parseInt(s.nextLine()));
		}

    System.out.println("\nNúmeros en el orden original: " + a);
    
    Collections.sort(a);

    System.out.println("\nNúmeros ordenados de menor a mayor: " + a );
    
    ArrayList<Integer> b = new ArrayList<Integer>();

      for(int n : a) {
        b.add(0, n);
      }
        
      System.out.println("Lista ordenada de mayor a menor: " + b);
    
        
    // Descomenta el siguiente bloque para ordenar la lista de mayor a
    // menor
    /*
      ArrayList<Integer> b = new ArrayList<Integer>();

      for(int n : a) {
        b.add(0, n);
      }
        
      System.out.print("Lista ordenada de mayor a menor: " + b);
    */
 
  }
}

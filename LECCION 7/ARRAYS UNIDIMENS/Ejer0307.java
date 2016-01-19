/**
 * Ejercicio 3
 *
 * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden
inverso, es decir, el primero que se introduce es el último en mostrarse y viceversa.
 * 
 * @author Elena Téllez
 */

public class Ejer0307{
  public static void main(String[] args) {
        
  int[]num = new int[10];

    for (int i = 0; i < 10; i++) {
    System.out.println("Por favor, introduzca un numero");  
    num[i] = Integer.parseInt(System.console().readLine());    
    } 
    
    for (int i = 9; i >=0; i--) {
      System.out.println("En orden inverso: " + num[i]);
    }
        
  }
}

/**
 * Ejercicio 7
 *
 * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre
por pantalla separados por espacios. El programa pedirá entonces por teclado dos valores
y a continuación cambiará todas las ocurrencias del primer valor por el segundo en
la lista generada anteriormente. Los números que se han cambiado deben aparecer
entrecomillados.
 * 
 * @author Elena Téllez
 */

public class Ejer0707{
  public static void main(String[] args) {
    
    int[]numero = new int[100];    
    
    for (int i = 0; i < 100; i++) {
      
      numero[i] = (int)(Math.random()*20);            
      
      System.out.print(" " + numero[i]);
      
    }
    
    System.out.println("\nPor favor, introduzca un numero del 1 al 20:");  
    int numUno = Integer.parseInt(System.console().readLine()); 
    
    System.out.println("\nPor favor, introduzca otro numero:");  
    int numDos = Integer.parseInt(System.console().readLine()); 
    
    for (int i = 0; i < 100; i++) {
      
      if (numero[i] == numUno) {
        
        System.out.print("\"" + numDos + "\"");
      } else {
          System.out.printf(" " + numero[i]);
        }  
    }
  }
}

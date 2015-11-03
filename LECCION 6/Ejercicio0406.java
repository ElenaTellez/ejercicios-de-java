/**
* Ejercicio 4 Leccion 6
*
* Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados por
* espacios.
*
* @author Elena Téllez
*/

public class Ejercicio0406 {
  public static void main(String[] args) {


    System.out.println ("Muestra 20 números entre 0 y 10 separados por espacios: ");
    
               
    for (int i = 1; i <=20; i++) {
      
      int numero = (int)(Math.random()*11);
      System.out.print(numero + " ");
          
    }
  }  
}

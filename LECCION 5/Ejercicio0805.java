/**
 * Ejercicio 8 Lección 5
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Elena Téllez
 */
public class Ejercicio0805 {

  public static void main(String[] args) {
    
    int numero;
        
    do {
      System.out.print("Por favor introduzca un numero del 1 al 19: ");
      numero = Integer.parseInt(System.console().readLine());
      
      System.out.println("" + numero * 1);
      System.out.println("" + numero * 2);
      System.out.println("" + numero * 3);
      System.out.println("" + numero * 4);
      System.out.println("" + numero * 5);
      System.out.println("" + numero * 6);
      System.out.println("" + numero * 7);
      System.out.println("" + numero * 8);
      System.out.println("" + numero * 9);
      System.out.println("" + numero * 10); 
      
      
      numero++;
  
    } while((numero > 0) && (numero <19));
   }
}

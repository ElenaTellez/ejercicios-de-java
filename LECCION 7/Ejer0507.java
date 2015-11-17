/**
 * Ejercicio 5
 *
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números
introducidos junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo
respectivamente.
 * 
 * @author Elena Téllez
 */

public class Ejer0507{
  public static void main(String[] args) {
        
   int[]num = new int[10];
  

    for (int i = 0; i < 10; i++) {
    System.out.println("Por favor, introduzca un numero");  
    num[i] = Integer.parseInt(System.console().readLine());    
    } 
    
    for (int i = 0; i < 10; i++) {
      
      int maximo = num[i];
      int minimo = num[i]; 
      
      System.out.print("Valores: " + num[i]);       
      
      if (num[i] > maximo) {
      
      num[i] = maximo;  
      System.out.print("maximo");
      }
      
      if (num[i] < minimo) {
        
      num[i] = minimo;  
      System.out.print("minimo");
      } 
      
      System.out.println();
      
    }    
  }
}

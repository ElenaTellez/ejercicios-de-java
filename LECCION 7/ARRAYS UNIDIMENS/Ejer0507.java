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
    int maximo = Integer.MIN_VALUE; // tambien int maximo = num[0] y int minimo = num[0]
    int minimo = Integer.MAX_VALUE;
    int i;
  
  
    System.out.println("Por favor, introduzca diez numeros: "); 

    for (i = 0; i < 10; i++) {
     
    num[i] = Integer.parseInt(System.console().readLine());    
         
      if (num[i] > maximo) {
               
       maximo = num[i];            
      }
      
      if (num[i] < minimo) {
        
      minimo = num[i];        
      }
    }
    
    System.out.println();
    
     for (i = 0; i < 10; i++) {
      
      System.out.print(num[i]);
      
      if (num[i] == maximo) {
        
        System.out.print(" máximo");
      }
      
      if (num[i] == minimo) {
        
        System.out.print(" mínimo");
      } 
      
      System.out.println();     
    }
    
  }
}

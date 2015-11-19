/**
 * Ejercicio 6
 *
 * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota
los elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición
1, el de la 1 a la 2, etc. El número que se encuentra en la última posición debe pasar a la
posición 0. Finalmente, muestra el contenido del array.
 * 
 * @author Elena Téllez
 */

public class Ejer0607{
  public static void main(String[] args) {
        
    int[]num = new int[15];      
    int i;
    
       
  
    System.out.println("Por favor, introduzca quince numeros: "); 

    for (i = 0; i < 15; i++) {
     
    num[i] = Integer.parseInt(System.console().readLine());  
    
    }  
    
    System.out.println("Valores introducidos:");
    
           
    for (i = 0; i < 15; i++) {
              
          
      System.out.print(" " + num[i]);
                  
    }      
    
    System.out.println("\nValores modificados:");
    
    int ultimo = num[14];
    
      
    for (i = 14; i > 0; i--) { // rota una posicion a la derecha
              
      num[i] = num[i-1];
    }  
     
    num[0] = ultimo;     
      
     for (i = 0; i < 15; i++) {
          
          
      System.out.print(" " + num[i]);
                  
    }
     
    
    System.out.println();
    
       
  }
}

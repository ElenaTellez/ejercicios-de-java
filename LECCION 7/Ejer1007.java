/** 
 * Ejercicio 10
 *
 * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100 y que los
almacene en un array. El programa debe ser capaz de pasar todos los números pares a las
primeras posiciones del array (del 0 en adelante) y todos los números impares a las celdas
restantes. Utiliza arrays auxiliares si es necesario.
 * 
 * @author Elena Téllez
 */

public class Ejer1007 {
  public static void main(String[] args) {
    
    int[]numero = new int[20];  
    
    numero[i] = (int)(Math.random()*100);   
    
        
    for (int i = 0; i<20; i++){
      
       
      if (numero[i]%2 == 0){
      
        numero[i] = numero[0];
      
        System.out.println(numero[i] + " par");
      
      } else {
          System.out.println(numero[i] + " impar");
        }
    
    }
  }  
}    

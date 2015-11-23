/**
 * Ejercicio 9
 *
 * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto
con la palabra “par” o “impar” según proceda.
 * 
 * @author Elena Téllez
 */

public class Ejer0907 {
  public static void main(String[] args) {
    
    int[]numero = new int[8];     
    
    System.out.println("Por favor, introduzca un numero entero:");  
    
    for (int i = 0; i<8; i++){
      
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println("A continuación le mostraremos si los numeros introducidos son pares o impares:");
    
    for (int i = 0; i<8; i++){
    
      if (numero[i]%2 == 0){
      
        System.out.println(numero[i] + " par");
      
      } else {
          System.out.println(numero[i] + " impar");
        }
    
    }
  }  
}    

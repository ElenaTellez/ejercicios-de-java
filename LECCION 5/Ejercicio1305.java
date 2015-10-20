
/**
 * Ejercicio 13 Leccion 5
 * 
 * Escribe un programa que lea una lista de diez números y determine cuáles son positivos,
 * y cuáles son negativos.
 * 
 * @author Elena Téllez
 */

public class Ejercicio1305 {

  public static void main(String[] args) {
    
    System.out.println("Este programa le indica que números de los introducidos son positivos y cuales negativos");
        
    int contador = 1;
    
    do {
    
    System.out.print("Por favor, introduzca un numero: ");
    int n = Integer.parseInt(System.console().readLine());
      
      if (n>=0) {
        System.out.print("El numero introducido es positivo.\n");
      } else {
          System.out.print("El numero introducido es negativo.\n");
        }
    
    contador++;
        
    } while (contador<=10);  
  }
}

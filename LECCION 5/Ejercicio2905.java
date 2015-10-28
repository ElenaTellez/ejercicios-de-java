/**
 * Ejercicio 29 Lección 5
 * 
 * Escribe un programa que muestre por pantalla todos los números enteros positivos menores
 * a uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
 *  
 * 
 * @author Elena Téllez
 */
public class Ejercicio2905 {

  public static void main(String[] args) {  
   
     
    int numeroUno;
    int numeroDos;  
    
           
		System.out.print("Introduzca un número entero y positivo: ");
    numeroUno = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca otro número menor que el anterior: ");
    numeroDos = Integer.parseInt(System.console().readLine());
    
      
    System.out.println("Los números menores de " + numeroUno + " no divisibles por  " + numeroDos + " son:" );  
      
    for (int i = 1; i < numeroUno; i++) {
			if ((i%numeroDos) != 0) {		
      System.out.print(i + " "); 
      
      }      
    }   

  }
}

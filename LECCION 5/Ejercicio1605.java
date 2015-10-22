/**
 * Ejercicio 16 Lección 5
 * 
 * Escribe un programa que diga si un número introducido por teclado es o no primo. Un
 * número primo es aquel que sólo es divisible entre él mismo y la unidad.
 * 
 * @author Elena Téllez
 */
public class Ejercicio1605 {

  public static void main(String[] args) { 
   
      
    System.out.print("¿Será un numero primo?\n");
         
    System.out.print("Por favor introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
	
    boolean esPrimo = true;
	
    for (int i = 2; i < numero; i++) {         
      if ((numero % i) == 0) { //el resto de dividir número entre 2 es igual a 0 no podria ser primo
        esPrimo = false;	//porque el numero primo solo se puede divider entre el mismo o 1
      } 
    }  
      
      if (esPrimo) {
      System.out.println("El número introducido es primo.");
    } else {
      System.out.println("El número introducido no es primo.");
    }                
  }
}

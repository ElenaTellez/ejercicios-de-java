/**
 * Ejercicio 16 Leccion 4
 *
 * Escribe un programa que diga cuál es la primera cifra de un número
 * entero introducido por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Elena Téllez
 */
public class Ejercicio1804 {

  public static void main(String[] args) {
    
    int n, primera = 0;
        
    System.out.print("Por favor, introduzca un número entero (de 5 cifras como máximo): ");
    n = Integer.parseInt(System.console().readLine());  
    
    if (n < 0) {
				n = (n * -1);
		} 
    
    if ( n < 10 ) {
      primera = n;
      System.out.println("La primera cifra del número introducido es el " + primera);
		}
    
    if (( n >= 10 ) && ( n < 100 )) {
      primera = n / 10;
      System.out.println("La primera cifra del número introducido es el " + primera);
    }
    
    if (( n >= 100 ) && ( n < 1000 )) {
      primera = n / 100;
      System.out.println("La primera cifra del número introducido es el " + primera);
    }
    
    if (( n >= 1000 ) && ( n < 10000 )) {
      primera = n / 1000;
      System.out.println("La primera cifra del número introducido es el " + primera);
    }
    
    if (( n >= 10000 ) && ( n <= 99999)) {
      primera = n / 10000;
      System.out.println("La primera cifra del número introducido es el " + primera);
		} else if (n > 99999) {
				System.out.println("El número introducido no es válido. ");
				}
  }  
}

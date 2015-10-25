
/**
 * Ejercicio 23 Lección 5
 * 
 * Escribe un programa que permita ir introduciendo una serie indeterminada de números
 * mientras su suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el
 * total acumulado, el contador de los números introducidos y la media.
 * 
 * @author Elena Téllez
 */
public class Ejercicio2305 {

  public static void main(String[] args) {   
      
       
             
    System.out.println("Por favor introduzca números. ");
    System.out.println("Cuando la suma de sus numeros llegue a 10000 le informaremos: ");
    
    int contador = 0;
    int suma = 0;
    int numero;
    
    
    do {
			
			numero = Integer.parseInt(System.console().readLine());
			
			suma += numero;			
			contador++;
			   
		} while (suma <= 10000);
	
		 
    
    System.out.println("Total acumulado: " + suma);
		System.out.println("Numeros introducidos: " + contador);
    System.out.println("Media números introducidos: " + (suma/contador));             
    
  } 
}

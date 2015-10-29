
/**
 * Ejercicio 27 Lección 5
 * 
 * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay entre 1 y un
 * número leído por teclado.
 * 
 * @author Elena Téllez
 */
public class Ejercicio2705 {

  public static void main(String[] args) {  
   
           
		System.out.println("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int contador = 0;    
    int suma = 0;
		 

    
    System.out.println("Los números múltiplos de 3 entre 1 y " + numero + " son: ");
    
    for (int i = 1; i<=numero;i++) {		
			
			if ((i % 3 == 0) && (i<=numero)) {			
				System.out.print(i + "  ");	
				contador++;
				suma +=i;
			}	
			
		}	
		
		System.out.println("\nEl número de multiplos es: " + contador);	
		System.out.println("El resultado de sumar los multiplos es: " + suma );

    
  }
}

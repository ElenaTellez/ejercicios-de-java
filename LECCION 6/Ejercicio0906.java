/**
* Ejercicio 9 Leccion 6
*
* Realiza un programa que vaya generando números aleatorios pares entre 0 y 100 y que no
* termine de generar números hasta que no saque el 24. El programa deberá decir al final
* cuántos números se han generado.
*
* @author Elena Téllez
*/

public class Ejercicio0906 {
  public static void main(String[] args) {


    System.out.println ("números aleatorios pares entre 0 y 100: ");
    
    int numero =  0;    
    int contador = 0;
                   
    do  {
      
			numero = (int)(Math.random()*101);
      
      if (numero %2 == 0) {
      
				System.out.print(numero + " ");
				contador++;
			}
			
    } while (numero != 24);   
 
    System.out.println ("\nSe han generado:" + contador + " números.");
  
  }  
}

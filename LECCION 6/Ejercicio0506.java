/**
* Ejercicio 5 Leccion 6
*
* Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por
* espacios. Muestra también el máximo, el mínimo y la media de esos números.
*
* @author Elena Téllez
*/

public class Ejercicio0506 {
  public static void main(String[] args) {


    System.out.println ("Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos) separados por espacios: ");
    
    int mayorNumero = 100;
    int menorNumero = 199;
    int suma = 0;
    int numero = 0;
                   
    for (int i = 1; i <=49; i++) {
      
      numero = ((int)(Math.random()*99) + 100);
      System.out.print(numero + " ");
      suma = suma + numero;    
    
      if (numero > mayorNumero) {
        mayorNumero = numero;
        }
       
      if (numero < menorNumero) {
        menorNumero = numero;
      } 
    }
    
    System.out.println ("\nEl mayor de los números introducidos es:" + mayorNumero);
    System.out.println ("El menor de los números introducidos es:" + menorNumero);
    System.out.println ("La media de los números introducidos es:" + (suma / 50));
             
    
  }  
}

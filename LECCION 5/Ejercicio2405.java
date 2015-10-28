/**
 * Ejercicio 24 Leccion 5
 * 
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas
 * como en la siguiente figura:
 *   1
 *  121
 * 12321
 *1234321
 * 
 * @author Elena Téllez
 */

public class Ejercicio2405 {

  public static void main(String[] args) {
    
    System.out.print("Vamos a dibujar una pirámide.\n ");
    System.out.print("Por favor, introduzca la altura que desee que tenga la pirámide.\n ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    
    
    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;
    
    while (altura <= alturaIntroducida) {
      
      // inserta espacios delante de números
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea de números, media piramide con numeros de 1 a n introducido
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      
      // pinta la línea de números, media piramide con numeros de  n introducido a 1
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      
      System.out.println();
      
      altura++;
      espacios--;
    } // while
  }
}


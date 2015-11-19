/**
 * Ejercicio 1
 *
 * Define un array de 10 caracteres con nombre simbolo y asigna valores a los elementos
según la tabla que se muestra a continuación. Muestra el contenido de todos los elementos
del array. ¿Qué sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author Elena Téllez
 */

public class Ejer0207 {
  public static void main(String[] args) {
        
    // se define simbolo como un array formado por un caracter en cada uno. Un caracter comilla simple
    char[] simbolo = new char[9]; // se reserva espacio para 9 enteros


simbolo[0] = 'a';
simbolo[1] = 'x';
simbolo[4] = '@';
simbolo[6] = ' ';
simbolo[7] = '+';
simbolo[8] = 'Q';
        
    
        
    for (int i = 0; i < 9; i++) {
      System.out.println("Valores:" + simbolo[i] );
    }
  }
} // respuesta: no le asigna valores se queda vacio

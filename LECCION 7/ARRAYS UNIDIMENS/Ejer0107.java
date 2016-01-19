/**
 * Ejercicio 1
Define un array de 12 números enteros con nombre num y asigna los valores según la tabla
que se muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué
sucede con los valores de los elementos que no han sido inicializados?
 * 
 * @author Elena Téllez
 */

public class Ejer0107 {
  public static void main(String[] args) {
        
    // se define n como un array de enteros
 int[]num = new int[12]; // se reserva espacio para 11 enteros


num[0] = 39;
num[1] = -2;
num[6] = 14;
num[8] = 5;
num[9] = 120;        
    
        
    for (int i = 0; i < 12; i++) {  // for (int n : num) { nos serviria tambien en este caso ya que solo mostramos valores
      System.out.println("Valores:" + num[i] );
    }
  }
}  // Respuesta: los indices que no estan les da valor 0

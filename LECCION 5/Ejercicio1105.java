/**
 * Ejercicio 11 Leccion 5
 * 
 * Escribe un programa que muestre en tres columnas, el cuadrado y
 * el cubo de los 5 primeros números enteros a partir de uno que se
 * introduce por teclado.
 * 
 * @author Elena Téllez
 */

public class Ejercicio1105 {

  public static void main(String[] args) {
    
    System.out.print("Introduzca un número: "); //cuando utilizo print no hay salto de linea, por eso sale por columnas
    int n = Integer.parseInt(System.console().readLine());

    for (int i = n; i < n + 5; i++) {
      System.out.printf("numero: %3d cuadrado: %6d cubo %9d\n", i, i * i, i * i * i);
    }
  }
} // a través de la formula printf cada vez que se introduce un numero 
// se pruduce un salto de linea. 
// con %3d indico que la primera columna sera a 3 espacios, y asi sucesivamente

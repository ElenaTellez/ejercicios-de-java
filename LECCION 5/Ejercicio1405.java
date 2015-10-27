/**
 * Ejercicio 14 Leccion 5
 * 
 * Escribe un programa que pida una base y un exponente (entero positivo)
 * y que calcule la potencia.
 * 
 * @author Elena Téllez
 */

public class Ejercicio1405 {

  public static void main(String[] args) {
    
    System.out.println("Cálculo de una potencia");
    
    System.out.print("Introduzca la base: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());

    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1; // Todo numero elevado a 0 es = a 1
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base; // potencia = potencia + base
      }
    }
    System.out.println(base + "^" + exponente + " = " + potencia);
  }
}
//una potencia se calcula multiplicando la base tantas veces como indica el exponente 
// pj: 2 elevado a 3 seria 2 X 2 x 2

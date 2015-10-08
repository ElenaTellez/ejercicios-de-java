/**
 * Ejercicio 5 Leccion 4
 *
 * Realiza un programa que resuelva una ecuación de primer grado
 * (del tipo ax + b = 0).
 *
 * @author Elena Tellez
 */

public class Ejercicio0504 {
  public static void main(String[] args) {

    System.out.println("Este programa calcula el  valor a de su ecuación de primer grado del tipo/nax + b = 0");
    System.out.print("Por favor,  introduzca el valor de a: ");
    Double a = Double.parseDouble(System.console().readLine());
    System.out.print("Ahora introduzca el valor de b: ");
    Double b = Double.parseDouble(System.console().readLine());

    if (a == 0) {
    System.out.println("Lo sentimos, su ecuación no tiene solución");
    } else {
      System.out.println("x = " + (-b/a));
    }
  }
}

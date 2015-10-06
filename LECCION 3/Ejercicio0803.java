/**
 * Ejercicio 8 Leccion 3: Lectura de datos desde teclado
 *
 * Escribe un programa que calcule el salario semanal de un empleado
 *    en base a las horas trabajadas, a razón de 12 euros la hora.
 *
 * @author Elena Téllez
 */

public class Ejercicio0803 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    System.out.println("Su salario semanal es de " + (horasTrabajadas * 12) + " euros.");
  }
}

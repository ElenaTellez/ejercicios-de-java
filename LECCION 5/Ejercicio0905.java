/**
 * Ejercicio 9 Lección 5
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Elena Téllez
 */
public class Ejercicio0905 {

  public static void main(String[] args) {
    
    int numero;
      
    System.out.print("¡Vamos a aprender las tablas de multiplicar!\n");
         
    System.out.print("Por favor introduzca un número del 1 al 10: ");
    numero = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < 11; i++) {         
      System.out.println(numero + "x" + i + " = " + (numero * i));
    }                 
  }
}

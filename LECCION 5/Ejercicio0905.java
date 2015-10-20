/**
 * Ejercicio 9 Lección 5
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Elena Téllez
 */
public class Ejercicio0905 {

  public static void main(String[] args) {
    
    int digito = 1;     
    
    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int n = numero;
          
    while (n > 10) {
      n /= 10; // n = n/10
      digito++; // vamos a entrar en el bucle mientras n sea mayor que 10
    }
    
    System.out.println(numero + " tiene " + digito + " dígito/s.");
  }
}

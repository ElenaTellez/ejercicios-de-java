/**
 * Ejercicio 9 Lección 5
 * 
 * Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado.
 * 
 * @author Elena Téllez
 */

public class Ejercicio0905 {

  public static void main(String[] args) {
    
    int numeroDeDigitos = 1, n, numeroIntroducido;

    System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    n = numeroIntroducido;
    
    while (n > 10) {
      n /= 10; // n = n/10
      numeroDeDigitos++;
    }
    
    System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");

  }
}
// numero de digitos tiene valor 1, y cada vez que se repita el buble le sumamos 1
// el bucle se repite mientras n se mayor que diez, por ejemplo: 357 lo divido entre 10, y sumo 1.
// 35,7 lo vuelvo a dividir entre diez y me queda 3,5. El bucle se ha repetido 2 veces 
// n=1 mas dos veces total 3, que son los digitos de mi numero.
// el bucle no se repite porque 3,5 el menor que 10

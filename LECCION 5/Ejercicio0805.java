/**
 * Ejercicio 8 Lección 5
 * 
 * Muestra la tabla de multiplicar de un número introducido por teclado.
 * 
 * @author Elena Téllez
 */
public class Ejercicio0805 {

  public static void main(String[] args) {
    
    int numero;
      
    System.out.print("¡Vamos a aprender las tablas de multiplicar!\n");
         
    System.out.print("Por favor introduzca un número: ");
    numero = Integer.parseInt(System.console().readLine());

    for (int i = 1; i < 11; i++) {         
      System.out.println(numero + "x" + i + " = " + (numero * i));
    }                 
  }
}


/**
 * Ejercicio 12 Leccion 5
 * 
 * Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer
 * término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos
 * anteriores, por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
 * 144... El número n se debe introducir por teclado.
 * 
 * @author Elena Téllez
 */

public class Ejercicio1205 {

  public static void main(String[] args) {
    
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci.");
    System.out.print("Por favor, introduzca n: ");
    int n = Integer.parseInt(System.console().readLine());

    switch (n) {
      case 1: //el numero introducido es 1
        System.out.print("0");
        break;
      case 2://el numero introducido es 2
        System.out.print("0 1");
        break;
      default:
        System.out.print("0 1");
       
        int f1 = 0;
        int f2 = 1;
        int aux;
       
      while(n > 2) {
        aux = f1; //AUX GUARDA EL VALOR DE F1 = 0
        f1 = f2; // A F1 LE DAMOS EL VALOR DE F2 = 1
        f2 = aux + f2; // F2 = 0 + 1 = 1
        System.out.print(" " + f2);
        n--;
      }//AL VOLVER A ENTRAR EN EL BUCLE AUX F1 Y F2 TOMARAN LOS NUEVOS VALORES ASIGNADOS 1 Y 1 POR LO QUE F2 VALDRA 2
    }  // PARA N = 4 VOLVEREMOS A ENTRAR EN EL BUCLE Y F1 = 1 Y F2 = 2, POR LO QUE f2 SERA = 3 Y ASI SUCESIVAMENTE (F1 ME GURARDA EL VALOR PARA AUX EN EL SIGUIENTE CALCULO)
  }
}

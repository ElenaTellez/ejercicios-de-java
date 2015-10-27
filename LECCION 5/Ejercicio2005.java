/**
 * Ejercicio 20 Leccion 5
 * 
 * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca. 
 * (Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
 * teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.)
 * 
 * @author Elena Téllez
 */

public class Ejercicio2005 {

  public static void main(String[] args) {
    
    System.out.print("Vamos a dibujar una pirámide.\n ");
    System.out.print("Por favor, introduzca la altura que desee que tenga la pirámide.\n ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el carácter que dibuje su pirámide.\n ");
    String relleno = (System.console().readLine());
    
    int tamaño = 1;
    int i = 0;
    int espaciosPorDelante = altura - 1;
    int espaciosInternos = 0;
    
    while (tamaño < altura) {
      
      // inserta espacios delante
      for (i = 1; i <= espaciosPorDelante; i++) {
        System.out.print(" ");
      }
      
      // pinta la línea
      System.out.print(relleno);
      for (i = 1; i < espaciosInternos; i++) {
        System.out.print(" ");
      }
      
      if (tamaño>1) { // para el segundo piso de la piramide
        System.out.print(relleno);
      }
      
      System.out.println();
      tamaño++;
      espaciosPorDelante--;
      espaciosInternos += 2;
    } // while ////////////////////////////
    
    // base de la pirámide
    for (i = 1; i < tamaño*2; i++) {
      System.out.print(relleno);
    }
  }
}

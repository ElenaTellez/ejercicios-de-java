/**
 * Ejercicio 12 Leccion 6
 * 
 * Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix) con el
 * código ascii entre el 32 y el 126. Puedes hacer casting con (char) para convertir un
 * entero en un carácter.
 *
 * @author Elena Téllez
 */
public class Ejercicio1206 {

  public static void main(String[] args) 
    throws InterruptedException {  //retardo, para que salga por pantalla mas lentamente. El número indica los minisegundos

    int linea = 0;
    
    System.out.print("\033[32m"); // pinta en verde
    
    for(int i = 0; i < 8000; i++) {
      System.out.print((char)(Math.random() * (126 - 32 + 1) + 32)); // char convierte en caracter el numero aleatorio
      
      if (linea++ == 60) {
        linea = 0;
        Thread.sleep(50); //retardo, para que salga por pantalla mas lentamente. El número indica los minisegundos
        System.out.println();
      }
    }
  }
}

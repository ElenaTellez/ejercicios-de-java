/**
 * Ejercicio 19 Leccion 5
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
 * teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 * 
 * @author Elena Téllez
 */

public class Ejercicio1905 {

  public static void main(String[] args) {
    
    System.out.print("Vamos a dibujar una pirámide.\n ");
    System.out.print("Por favor, introduzca la altura que desee que tenga la pirámide.\n ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.print("Por favor, introduzca el carácter que dibuje su pirámide.\n ");
    char y = Char.parseChar(System.console().readLine());
    
    for (int i = y; i <=x; i++) {
      System.out.printf("%xd %x++d %x+=4d\n", y, y, y);
    }
  }
} 
// con %3d indico que la primera columna sera a 3 espacios, y asi sucesivamente

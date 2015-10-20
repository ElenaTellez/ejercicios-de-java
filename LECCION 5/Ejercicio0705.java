/**
 * Ejercicio 7 Lección 5
 * 
 * Realiza el control de acceso a una caja fuerte. La combinación
 * será un número de 4 cifras. El programa nos pedirá la combinación
 * para abrirla. Si no acertamos, se nos mostrará el mensaje
 * “Lo siento, esa no es la combinación” y si acertamos se nos dirá
 * “La caja fuerte se ha abierto satisfactoriamente”. Tendremos cuatro
 * oportunidades para abrir la caja fuerte.
 * 
 * @author Elena Téllez
 */
public class Ejercicio0705 {

  public static void main(String[] args) {
    
    int intentos = 1;
    int numeroIntroducido;
    boolean correcto = false;
    
    do {
      System.out.print("Introduzca la combinación de la caja fuerte: ");

      int combinacion = Integer.parseInt(System.console().readLine());
      combinacion = Integer.parseInt(System.console().readLine());
      
      if (combinacion == 1979) {
        correcto = true;
      } else {
        System.out.println("Combinación incorrecta");
        }
      
      intentos++; //intentos = intentos + 1;
  
    } while((intentos <=4) && (!correcto));
    
    if (correcto) {
      System.out.println("La combinación es correcta.");
    } else {
        System.out.println("Su caja fuerte está bloqueada.");
      }
  }
}

//boolean: se utiliza para las variables con dos significados: verdadero o falso, true o false, yes or no, 1 or 0. 
// estructura: boolean variable = true 

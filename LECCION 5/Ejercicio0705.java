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
    
    int intentos = 0;
    boolean salir = false; //salir es falso si quedan oportunidades y 
                           //todavia no hemos introducido correctamente contraseña
    
    
    do {
      System.out.print("Introduzca la combinación de la caja fuerte: ");
      int combinacion = Integer.parseInt(System.console().readLine());
      
      intentos++;
          
      if (combinacion == 1979) {
        System.out.println("La combinación es correcta.");
        salir = true;        
      } else {
        System.out.println("Combinación incorrecta");
      }
      
      if ((intentos == 4) && (!salir)) {
        System.out.println("Su caja fuerte está bloqueada.");
        salir = true;
      }  
      
  
    } while (!salir);
  }
}
//boolean: se utiliza para las variables con dos significados: verdadero o falso, true o false, yes or no, 1 or 0. 
// estructura: boolean variable = true 

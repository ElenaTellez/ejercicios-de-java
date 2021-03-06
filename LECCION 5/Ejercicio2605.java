/**
 * Ejercicio 26 Lección 5
 * 
 * Realiza un programa que pida primero un número y a continuación un dígito. El programa
 * nos debe dar la posición (o posiciones) contando de izquierda a derecha que ocupa ese
 * dígito en el número introducido.
 * 
 * @author Elena Téllez
 */
public class Ejercicio2605 {

  public static void main(String[] args) {  
   
           
  System.out.print("Introduzca un número entero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());

    System.out.print("Introduzca un dígito del número introducido: ");
    int digito = Integer.parseInt(System.console().readLine());

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
    
    // le da la vueta al número y calcula la longitud
    int numero = numeroIntroducido;
    int volteado = 0;
    int posicion = 1;
    
    
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      
    } // while
        
    // comprueba la posición
    while (volteado > 0) {
      if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
      }
      volteado /= 10;
      posicion++;
    } // while
    
    System.out.println();
  }
}


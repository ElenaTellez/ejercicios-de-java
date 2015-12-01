/**
 *Realiza un programa que elimine un determinado dígito de un número introducido por teclado. Utiliza el tipo long
donde sea necesario para aceptar números largos.
Ejemplo:
Introduzca un número entero: 291081756
¿Qué dígito desea eliminar? 1
El número resultante es el 2908756
 *
 * @author Elena Téllez
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
     
    System.out.print("Por favor, introduzca un número: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    System.out.print("¿Qué dígito desea eliminar?: ");
    int digito = Integer.parseInt(System.console().readLine());
    
    
    long numero = numeroIntroducido;
    long volteado = 1;
    
    while (numero > 0) {	
      
      volteado = (volteado * 10) + (numero % 10);
      numero = numero/10;
      
    }
    
     while (volteado > 1) {
      if ((volteado % 10) != digito) {
        System.out.print(volteado%10);
      }
      volteado /= 10;
       
    } // while
      
    
      
        
    System.out.println();
    
    
   }
}

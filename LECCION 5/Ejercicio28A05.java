/**
 * Ejercicio 28A  Lección 5
 * 
 * Escribe un programa que calcule el factorial de un número entero leído por teclado.
 *  
 * 
 * @author Elena Téllez
 */
public class Ejercicio28A05 {

  public static void main(String[] args) {  
           
		System.out.print("Introduzca un número entero mayor o igual que 0: ");
    int numero = Integer.parseInt(System.console().readLine());
    int factorial = numero; 
       
      for (int i = 1; i < numero; i++) {
        factorial *= i;
        
      } System.out.print(factorial);

     
    
  }
}

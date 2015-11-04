/**
* Ejercicio 6 Leccion 6
*
* Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo
* y tiene para ello 5 oportunidades. Después de cada intento fallido, el programa dirá cuántas
* oportunidades quedan y si el número introducido es menor o mayor que el número secreto.
* 
* @author Elena Téllez
*/

public class Ejercicio0606 {
  public static void main(String[] args) {
		
    System.out.println ("Adivine un número al azar entre 0 y 100 (ambos incluidos): ");
    
    
    int oportunidades = 5;
    int numero = ((int)(Math.random()*101));
		boolean acertado = false; 
		int n = 0; 
		
		
   
    System.out.println(numero);
                     
    do { 
			
			oportunidades--;
			
			System.out.print("Por favor introduzca un número: ");
			n = Integer.parseInt(System.console().readLine());
      
		  if ((n > numero) && (oportunidades > 0)){
				System.out.println("Su número es mayor que el número sercreto");
				System.out.println("Le quedan: " + oportunidades + " oportunidades.");
			}	  
			
			if ((n < numero) && (oportunidades > 0)) {
				System.out.println("Su número es menor que el número sercreto");
				System.out.println("Le quedan: " + oportunidades + " oportunidades.");
			} 
			
			if (n == numero) {
				acertado = true;
				System.out.println("¡¡Enhorabuena!! ¡¡Ha acertado!!");
			}
			
			
		
		} while ((n != numero) && (oportunidades > 0));
		
		if ((n != numero) && (oportunidades == 0)) {
			System.out.println("Lo sentimos, no ha acertado y ha agotado todas sus oportunidades.");
		}	
 
		
 
  }  
}

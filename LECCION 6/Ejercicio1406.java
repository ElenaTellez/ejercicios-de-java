/**
* Ejercicio 14 Leccion 6
*
* Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El programa
* intentará adivinar el número que estás pensando - un número entre 0 y 100 - teniendo para
* ello 5 oportunidades. En cada intento fallido, el programa debe preguntar si el número que
* estás pensando es mayor o menor que el que te acaba de decir
* 
* @author Elena Téllez
*/

public class Ejercicio1406 {
  public static void main(String[] args) {
		
    System.out.println ("Piense un número entre 0 y 100 (ambos incluidos): ");
  
    int oportunidades = 5;
    int numero = ((int)(Math.random()*101));
		boolean acertado = false; 
		      
    do { 
			
			oportunidades--;
			
			System.out.println("¿Ha elegido el numero: "+ numero+"? (S o N)");  
      acertado = (System.console().readLine());
      
      
      if (acertado == false) {
        
      System.out.println("Me quedan: " + oportunidades + " oportunidades.");  
      System.out.println ("¿Este número es mayor (1) o menor (2) que el número que usted ha elegido? ");
      
			int n = Integer.parseInt(System.console().readLine());
      
		  if ((n == 1) && (oportunidades > 0)){
        
        int numeroDos = (((int)(Math.random()* numero) + 1));
        
        System.out.println(numeroDos);        
				System.out.println("Me quedan: " + oportunidades + " oportunidades.");
			}	  
    }
			
			
			
		} while (numero == 0);
    	
		
			
 
  }  
}

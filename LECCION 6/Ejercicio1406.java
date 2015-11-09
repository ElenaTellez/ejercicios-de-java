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
		
    System.out.println ("Adivinare  un número que usted piense entre 0 y 100 (ambos incluidos): ");
  
    int oportunidades = 5;
    int respuesta = 0;
		boolean acertado = false; 
		int numeroMayor = 100;
    int numeroMenor = 0;
    
    int numero = ((int)(Math.random()*101));
      System.out.println ("¿Es " + numero + " ? Si (1) o No (2)");
      respuesta = Integer.parseInt(System.console().readLine());
      System.out.println ("¿Este número es mayor (1) o menor (2) que el número que usted ha elegido? ");
      int n = Integer.parseInt(System.console().readLine());
    
    
          
    do { 
			

			
          
      if ((n == 1) && (oportunidades > 0)) {
          
          numero = numeroMenor;
                    
      }
      
        if ((n == 2) && (oportunidades > 0)){
          
          numero = numeroMayor;    
          
      }	  
      
      oportunidades--;
      System.out.println("Me quedan: " + oportunidades + " oportunidades.");
    }  while ((respuesta == 2) && (oportunidades > 0));
		    	
		if (respuesta == 1) {
      System.out.println("¡Que bien! He acertado");
    } else { 
      System.out.println("¡Oooooh! No he acertado");  
    }
  }  
}

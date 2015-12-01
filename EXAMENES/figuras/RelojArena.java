/**
* Preparando examen
*
* dibujar un reloj de arena
*
* @author Elena Téllez
*/

public class RelojArena {
  public static void main(String[] args) {

    System.out.println("Vamos a dibujar una X.");
		System.out.println("Por favor, introduzca la altura que desee que tenga la X: ");
		int n = Integer.parseInt(System.console().readLine());
    
    
    
    int i = 0;    
    int j = 0;
    int k = 0;
		
		if ((n%2 != 0) && (n>3)) {
         
		for(i = n + 2; i>=4; i = i-2) {

    for (k = i -2 ; k <= (n + 1); k = k+2) {  // Añadimos los espacios necesarios delante de cada linea

       System.out.print(" ");

    }

    for (j = i-2; j > 0; j--) { // Mostramos los asteriscos

      System.out.print("*");

    }

    System.out.println();  
       

	}
	
	// parte inferior del reloj

    for (i = 1; i<= n; i = i+2) {        

      for (k = n  ; k >= i ; k = k - 2) { // Añadimos los espacios necesarios delante de cada linea

        System.out.print(" ");

      }  

      for (j = 0; j < i; j++) { // Mostramos los asteriscos

        System.out.print("*");

      }

      System.out.println();
		}
		
	} else {
		
		System.out.println("Error. El número introducido debe ser impar y mayor o igual a 3.");
		
		}
    
  }
}

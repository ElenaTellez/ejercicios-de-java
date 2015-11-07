/**
* Preparando examen
*
* Realiza un programa que pinte una cruz hecha de asteriscos. El programa debe pedir la longitud del
* brazo de la cruz. El asterisco del centro no cuenta en esa longitud.
* Ejemplo:
* Por favor, introduzca la longitud del brazo de la cruz: 2
*
* @author Elena Téllez
*/

public class Cruz {
  public static void main(String[] args) {

  System.out.println("Vamos a dibujar una cruz.");
  System.out.println("Por favor, introduzca la longitud del brazo que desee que tenga la cruz: ");
  int n = Integer.parseInt(System.console().readLine()); 

  int contador = n - 1;
  
  for (int i = 1; i <= n; i++) { 

			for (int k = 0; k <= n + contador; k++) { // Añadimos los espacios necesarios delante de cada *

        System.out.print(" ");
        
      }

      System.out.print("*");
      
      System.out.println();
      
    }  

  for (int j = 1; j <= (n*2)+1; j++){
		
		System.out.print("* ");
		       
  }  
  
  System.out.println();
  
  for (int l = 1; l <= n; l++) { 

		for (int m = 0; m<=n + contador; m++) { // Añadimos los espacios necesarios delante de cada *

      System.out.print(" ");

      }

      System.out.print("*");
      
      System.out.println();
      
    }
     
  }
}

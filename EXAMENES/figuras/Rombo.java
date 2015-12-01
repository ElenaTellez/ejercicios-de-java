/**
* Preparando examen
*
* dibujar un rombo
*
* @author Elena Téllez
*/

public class Rombo {
  public static void main(String[] args) {

    int i = 0;    
    int j = 0;
    int k = 0;

         // parte superior del rombo 

    for (i = 1; i<= 5; i = i+2) {

            

      for (k = 5+1; k>=i; k = k-2) { // Añadimos los espacios necesarios delante de cada linea

        System.out.print(" ");

      }

      for (j = 0; j < i; j++) { // Mostramos loas asteriscos

        System.out.print("*");

      }

      System.out.println();

		}

        //parte inferior del rombo

    for(i=5;i>=1;i=i-2) {

            

      for(k=i; k<=6+2 ;k=k+2) { // Añadimos los espacios necesarios delante de cada linea

        System.out.print(" ");

      }

            // Mostramos los asteriscos

      for(j=i-2;j>0;j--) {

          System.out.print("*");

       }

      System.out.println();

    }
  }
}

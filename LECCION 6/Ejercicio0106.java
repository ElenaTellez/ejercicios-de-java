
/**
* Ejercicio 1 Leccion 6
*
* Escribe un programa que muestre la tirada de tres dados. Se debe mostrar también la suma
* total (los puntos que suman entre los tres dados).
*
* @author Elena Téllez
*/

public class Ejercicio0106 {
  public static void main(String[] args) {


    System.out.println ("Vamos a tirar tres dados: ");
    
    int suma = 0;
            
    for (int i = 1; i <=3; i++) {
      
      int dado = ((int)(Math.random()*6) + 1);
      System.out.print(dado + " ");
      suma = suma + dado;
     
    }
           
    System.out.println ("\nLa suma de todas las tiradas es " + suma);
  } 
}

/**
* Generación de números aleatorios.
*
* @author Luis José Sánchez
*/

public class AleatorioTemperatura {
  public static void main(String[] args) {

    System.out.println("La previsión del tiempo para la próxima semana:");
    
    for (int i = 1; i <= 7; i++) {
      System.out.print(((int)(Math.random()*16) + 15 ) + "ºC "); //el intervalo entre 15 y 30 al sumar 15
    }

    System.out.println();
  }
}

/**
 * 2. Realiza un programa que llene un ArrayList con 50 números aleatorios comprendidos entre
 * 200 y 400. A continuación se debe recorrer ese ArrayList de tal forma que los números que
 * son capicúa vayan a otro ArrayList y los que no son capicúa a un tercer ArrayList.
 * Finalmente, muestra el contenido de las tres listas.
 *
 * @author Elena Téllez
 */
import java.util.ArrayList;

public class Ejercicio02Ex2014_2015  {
  public static void main(String[] args) {


    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> capicua = new ArrayList<Integer>();
    ArrayList<Integer> resto = new ArrayList<Integer>();

    for (int i = 0; i < 50; i++) {
      a.add((int)(Math.random()*200) + 200);
    }

    System.out.println("Lista generada: " + a);

    for(int n : a) {       
           
      if(esCapicua(n)== true){
        capicua.add(n);
      } else {      
       resto.add(n);
      }
     }

    System.out.println("Los números capicúas son:" + capicua);
    System.out.println("Los números no capicúas son : " + resto);
      
  }
   /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     falso en caso contrario.
   * <p>
   * Un número capicúa es el que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   * 
   * @param x número del que se quiere saber si es capicúa
   * @return  verdadero si el número que se pasa como parámetro es capicúa y
   *          falso en caso contrario
   */
	
	public static boolean esCapicua(long x) {
		return x == voltea(x);
	}

  /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
   * falso en caso contrario.
   * <p>
   * Un número capicúa es el que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   *
   * @param x número del que se quiere saber si es capicúa
   * @return  verdadero si el número que se pasa como parámetro es capicúa y
   *          falso en caso contrario
   */
	public static boolean esCapicua(int x) {
		return esCapicua((long)x);
	}
  /**
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
	public static long voltea(long x) {
		if (x < 0) {
		return -voltea(-x);
		}

		long volteado = 0;

	while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }

  /**
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
	public static int voltea(int x) {
		return (int)voltea((long)x);
	}
}

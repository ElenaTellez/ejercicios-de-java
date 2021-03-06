import java.util.ArrayList;

/**
 * Realiza un programa que llene un ArrayList con 40 n�meros aleatorios comprendidos entre
 * 100 y 300. A continuaci�n se debe recorrer ese ArrayList de tal forma que los n�meros pares
 * vayan a otro ArrayList y los que no son pares a un tercer ArrayList. Finalmente, muestra el
 * contenido de las tres listas.
 * 
 * @author Elena T�llez
 *
 */

public class Ejer01ex2015 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();
		
		for (int i = 0; i < 40; i++){		
			a.add((int)(Math.random()*200)+100);
		}
		
		System.out.println("Array original: ");
		System.out.println(a);
		
		for (int i = 0; i < 40; i++){		
		
			if (a.get(i)%2 == 0){
				par.add(a.get(i));
			} else {
				impar.add(a.get(i));
			}
		}	
		System.out.println("Array par: ");
		System.out.println(par);
		System.out.println("Array impar: ");
		System.out.println(impar);
	}

}

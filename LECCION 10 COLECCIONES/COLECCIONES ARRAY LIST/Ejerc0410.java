
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 4
 * 
 * Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 * debe ordenar palabras en lugar de números.
 * 
 * @author Elena Tellez
 */

public class Ejerc0410 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<String> a = new ArrayList<String>();

		for (int i = 0; i < 10; i++) {

			System.out.print("Por favor introduce una palabra: ");
			a.add(sc.nextLine());
		}

		System.out.println("\nPalabras en el orden original: " + a);

		Collections.sort(a);

		System.out.println("\nPalabras ordenadas alfabeticamente: " + a);

		ArrayList<String> b = new ArrayList<String>();
		
		for (String n : a) {
			b.add(0, n);
		}

		System.out.println("Lista ordenada de mayor a menor alfabeticamente: " + b);

		sc.close();

	}
}

/**
 * 12. Escribe un programa que genere una baraja española (la baraja española consiste en un mazo de 40 naipes
 * numerados del 1 al 12, que son: oros, copas, espadas y bastos. Las figuras corresponden a los números 10 "sota",
 * 11 "caballo" y 12 "rey", respectivamente).
 * El programa ademas generará 1 tirada  para 3 jugadores de 4 cartas cada uno. Despúes sumará 
 * los puntos según el juego de la brisca. 
 * El valor de las cartas se debe guardar en una estructura <code>HashMap</code> que debe contener parejas (figura, valor),  
 * por ejemplo ("caballo", 3).
 *    
 * La secuencia de cartas debe ser una estructura de la clase <code>ArrayList</code> que contiene objetos de la clase <code>Carta
 * El valor de las cartas es el siguiente: as → 11, tres → 10, sota → 2, caballo → 3, rey → 4; el resto de cartas no vale nada.
 * 
 * Ejemplo:
 * [siete de copas, cuatro de oros, as de oros, rey de copas]
 * [rey de espadas, rey de bastos, rey de oros, cinco de espadas]
 * [seis de oros, siete de oros, caballo de oros, cinco de oros]
 * siete de copas
 * cuatro de oros
 * as de oros
 * rey de copas
 * El jugador Uno tiene 15 puntos.
 * rey de espadas
 * rey de bastos
 * rey de oros
 * cinco de espadas
 * El jugador Dos tiene 12 puntos.
 * seis de oros
 * siete de oros
 * caballo de oros
 * cinco de oros
 * El jugador Tres tiene 3 puntos.
 *    
 *    @author Elena Téllez
 */

import java.util.ArrayList;
import java.util.HashMap;

public class juegoCartas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Carta> mazo = new ArrayList<Carta>();
		// creo el mazo de carta y cada carta es un objeto de la clase carta

		HashMap<String, Integer> valor = new HashMap<String, Integer>();
		// le doy valores a las cartas. Esto lo necesitare para calcular el
		// valor de la tirada

		valor.put("as", 11);
		valor.put("dos", 0);
		valor.put("tres", 10);
		valor.put("cuatro", 0);
		valor.put("cinco", 0);
		valor.put("seis", 0);
		valor.put("siete", 0);
		valor.put("sota", 2);
		valor.put("caballo", 3);
		valor.put("rey", 4);

		int puntosUno = 0;
		int puntosDos = 0;
		int puntosTres = 0;

		Carta cartaAux;

		for (int k = 0; k < 40; k++) { // genero todas las cartas que
										// necesitan
										// los jugadores
			do {
				cartaAux = new Carta();
			} while (mazo.contains(cartaAux));

			mazo.add(cartaAux);

		}

		for (int i = 0; i < 3; i++) {

			ArrayList<Carta> uno = new ArrayList<Carta>();
			ArrayList<Carta> dos = new ArrayList<Carta>();
			ArrayList<Carta> tres = new ArrayList<Carta>();

			// genero los jugadores y reparto cartas

			for (int j = 0; j < 4; j++) {
				uno.add(mazo.get(j));
				mazo.remove(mazo.get(j));
			}
			for (int j = 0; j < 4; j++) {
				dos.add(mazo.get(j));
				mazo.remove(mazo.get(j));
			}
			for (int j = 0; j < 4; j++) {
				tres.add(mazo.get(j));
				mazo.remove(mazo.get(j));
			}
			System.out.println(uno);
			System.out.println(dos);
			System.out.println(tres);

			for (Carta miCarta : uno) {
				System.out.println(miCarta);
				puntosUno += valor.get(miCarta.getFigura());
			}
			System.out.println("El jugador Uno tiene " + puntosUno + " puntos.");

			for (Carta miCarta : dos) {
				System.out.println(miCarta);
				puntosDos += valor.get(miCarta.getFigura());
			}
			System.out.println("El jugador Dos tiene " + puntosDos + " puntos.");

			for (Carta miCarta : tres) {
				System.out.println(miCarta);
				puntosTres += valor.get(miCarta.getFigura());
			}
			System.out.println("El jugador Tres tiene " + puntosTres + " puntos.");

		}

		System.out.println(mazo);
		
		int [] n = new int [3];
		n[0] = puntosUno;
		n[1] = puntosDos;
		n[2] = puntosTres;
		
		if (maximoArray(n) == n[0]){
		
			System.out.print("El ganador es el Jugador Uno: " + maximoArray(n));
		}
		
		if (maximoArray(n) == n[1]){
		
			System.out.print("El ganador es Jugador Dos: " + maximoArray(n));
		}
		
		if (maximoArray(n) == n[2]){
		
			System.out.print("El ganador es Jugador Tres: " + maximoArray(n));
		}
		
		

	}

/**
* 
* 3. maximoArrayInt: Devuelve el máximo del array que se pasa como
* parámetro.
* 
* @param  tres valores
* @return el valor maximo
*/	

	public static int maximoArray(int x[]) {
		
		
    int maximo = Integer.MIN_VALUE;
  
		for(int n:x) {
      
			if (n > maximo){
		    maximo = n;
			}  
		}
		     
		return maximo;
	}
  
}

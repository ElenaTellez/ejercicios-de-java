/**
 * 7. La m�quina Eurocoin genera una moneda de curso legal cada vez que
 *    se pulsa un bot�n siguiendo la siguiente pauta: o bien coincide el
 *    valor con la moneda anteriormente generada - 1 c�ntimo, 2 c�ntimos,
 *    5 c�ntimos, 10 c�ntimos, 25 c�ntimos, 50 c�ntimos, 1 euro o 2 euros -
 *    o bien coincide la posici�n � cara o cruz. Simula, mediante un
 *    programa, la generaci�n de 6 monedas aleatorias siguiendo la pauta
 *    correcta. Cada moneda generada debe ser una instancia de la clase
 *    Moneda y la secuencia se debe ir almacenando en una lista.
 *    Ejemplo:
 *    2 c�ntimos � cara
 *    2 c�ntimos � cruz
 *    50 c�ntimos � cruz
 *    1 euro � cruz
 *    1 euro � cara
 *    10 c�ntimos � cara
 *    
 *    @author Elena Tellez
 */
import java.util.ArrayList;

public class Eurocoin {

  public static void main(String[] args) {
	  
    ArrayList<Moneda> m = new ArrayList<Moneda>();
    
    Moneda monedaAux = new Moneda();//creo objetos de la clase moneda y los meto en array List
    m.add(monedaAux);
    
    String ultimaPosicion = monedaAux.getPosicion();
    String ultimaCantidad = monedaAux.getCantidad();
    
    for (int i = 0; i < 5; i++) {
      do {
        monedaAux = new Moneda();
      } while (!((monedaAux.getPosicion()).equals(ultimaPosicion)) && !((monedaAux.getCantidad()).equals(ultimaCantidad)));
      
      // este bucle examina que la posicion y el valor de la moneda sean distintos 
      //cada vez que genero un objeto moneda, solo coincide el valor o la posicion con la anterior
      
      
      m.add(monedaAux);
      ultimaPosicion = monedaAux.getPosicion();
      ultimaCantidad = monedaAux.getCantidad();
    }
    
    for (Moneda mo : m) {
      System.out.println(mo);
    }
  }
}
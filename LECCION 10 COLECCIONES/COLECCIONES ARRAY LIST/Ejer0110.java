/**
 * Ejercicio 1
 * 
 * Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 * 
 * @author Elena Tellez
 */

import java.util.ArrayList;

public class Ejer0110{
  public static void main(String[] args) {

    ArrayList<String> a = new ArrayList<String>();

    a.add("Eliana");
    a.add("Jose");
    a.add("Arroyo");
    a.add("Marilo");
    a.add("Costy");

    System.out.println("Contenido de la lista: ");        

    for(int i=0; i < a.size(); i++) {
      System.out.println(a.get(i));
    }
    
    System.out.println();
    System.out.println("Contenido de la lista: ");
    
    for(String nombre : a ) {
      System.out.println(nombre);
    }
  }
}

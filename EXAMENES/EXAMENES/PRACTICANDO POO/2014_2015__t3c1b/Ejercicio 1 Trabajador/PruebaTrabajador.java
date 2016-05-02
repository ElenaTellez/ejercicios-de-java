import java.util.Collections ;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1. Crea la clase Trabajador con las variables de instancia nombre, cargo y antiguedad.
 * Realiza un programa que pida por teclado los datos de 5 trabajadores, que se deben ir
 * almacenando en un ArrayList. El programa debe ser capaz de mostrar los datos de los
 * trabajadores ordenados alfabéticamente por nombre. Si coinciden los nombres, se ordena por
 * cargo y si coinciden tanto el nombre como el cargo se ordena por antigüedad (de menos a
 * más antigüedad).
 * 
 * @author Elena Téllez
 */
public class PruebaTrabajador {
  public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);   
   
    ArrayList<Trabajador> a = new ArrayList<Trabajador>();

    String nom = "";
		String car = "";
		String ant;
		    
		for (int i = 0; i <4; i++){
			System.out.println("Por favor escriba el nombre del trabajador: ");
			nom =  s.next();
			System.out.println("Por favor escriba el apellido del trabajador: ");
			car =  s.next();
			System.out.println("Por favor escriba la antigüedad del trabajador: ");
			ant =  s.next();
			a.add(new Trabajador(nom, car, ant));
		}
		
		for (Trabajador j : a){
			System.out.println (j+"\n");
		}
		
		Collections.sort(a);
		
		System.out.println("\nDatos de los Trabajadores ordenados por apellidos:");
		for (Trabajador trabajadorAux : a) {
		System.out.println(trabajadorAux+"\n");
		}
			
		s.close(); 
  }
}

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/**
 * Crea la clase Alumno con las variables de instancia nombre, apellidos y edad. Realiza un
 * programa que pida por teclado los datos de 5 alumnos, que se deben ir almacenando en un
 * ArrayList. El programa debe ser capaz de mostrar los datos de los alumnos ordenados
 * alfabéticamente por apellidos. Si coinciden los apellidos, se ordena por nombre y si coinciden
 * tanto los apellidos como el nombre se ordena por edad (del más joven al más viejo).
 * 
 * @author Elena Téllez
 * 
 */
public class Ejer02ex2015 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		ArrayList<Alumno> m = new ArrayList<Alumno>(); //Array List que contiene los objetos de la clase Alumno
		
		String nom = "";
		String ape = "";
		String ano;
		    
		for (int i = 0; i <3; i++){
			System.out.println("Por favor escriba el nombre del alumno: ");
			nom =  s.next();
			System.out.println("Por favor escriba el apellido del alumno: ");
			ape =  s.next();
			System.out.println("Por favor escriba la edad del alumno: ");
			ano =  s.next();
			m.add(new Alumno(nom, ape, ano));
		}
		
		for (Alumno j : m){
			System.out.println (j);
		}
		
		Collections.sort(m);
		
		System.out.println("\nDatos de los Alumnos ordenados por apellidos:");
		for (Alumno alumnoAux: m) {
		System.out.println(alumnoAux+"\n");
		}
			
		s.close();
	}

}

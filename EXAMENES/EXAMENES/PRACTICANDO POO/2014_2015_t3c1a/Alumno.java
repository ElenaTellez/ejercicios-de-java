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


public class Alumno implements Comparable<Alumno>{
	
	private String nombre;
	private String apellidos;
	private String edad;
	
	public Alumno(String n, String a, String e) {
	    this.nombre = n;
	    this.apellidos = a;
	    this.edad = e;
	}
	
	 public String getNombre() {
		    return nombre;
		  }

	 public void setNombre(String nombre) {
		    this.nombre = nombre;
		  }
	 public String getApellidos() {
		    return apellidos;
		  }

	 public void setApellidos(String apellidos) {
		    this.apellidos = apellidos;
		  }
	 public String getEdad() {
		    return edad;
		  }

	 public void setEdad(String edad) {
		    this.edad = edad;
		  }
	 
	 @Override
	  public String toString() {
	    String cadena = "\n------------------------------------------";
	    cadena += "\nNombre: " + this.nombre;  
	    cadena += "\nApellidos: " + this.apellidos;    
	    cadena += "\nEdad: " + this.edad;
	    cadena += "\n------------------------------------------";
	    
	    return cadena;
	  }
	 
	 @Override
	 public int compareTo(Alumno g) {
		 
		 if (apellidos.equals(g.getApellidos())) {
			 if (nombre.equals(g.getNombre())){
				 return edad.compareTo(g.getEdad());
			 }else{
				 return nombre.compareTo(g.getNombre());
			 }
		 } else {
			 return apellidos.compareTo(g.getApellidos());
		 }
	 }
		 
}

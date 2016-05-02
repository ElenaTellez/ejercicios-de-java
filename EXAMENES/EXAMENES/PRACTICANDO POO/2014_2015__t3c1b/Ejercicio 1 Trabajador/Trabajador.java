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

import java.util.Collections ;
import java.util.ArrayList ;

public class Trabajador implements Comparable<Trabajador>{
  private String nombre;
  private String cargo;
  private String antiguedad;
  
  public Trabajador(String nombre, String cargo, String antiguedad) {
	this.nombre = nombre; 
	this.cargo = cargo; 
	this.antiguedad = antiguedad; 
	}
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getAntiguedad() {
    return antiguedad;
  }

  public void setAntiguedad(String antiguedad) {
    this.antiguedad = antiguedad;
  }
  public String toString() {
		return "Nombre: " + this.nombre + "\nCargo: " + this.cargo + "\nRaza: " + this.antiguedad;
	}

	public int compareTo(Trabajador g) {
		if (nombre.equals(g.getNombre())){
			if (cargo.equals(g.getCargo())){
				return (antiguedad).compareTo(g.getAntiguedad());				
				}	else {
					return (cargo).compareTo(g.getCargo());
				} 
			}else {
				return (nombre).compareTo(g.getNombre()); 
			}
		
	}
}

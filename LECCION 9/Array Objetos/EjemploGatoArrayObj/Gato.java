package Ejercicio1ArrayObj;
import java.util.Scanner;

/**
 * Gato.java
 * Definición de la clase Gato
 * @author Elena Téllez
 */

public class Gato {
  
  private String nombre;
  private String raza;
  private String sexo;
    
   
  public String getNombre() {
   return nombre;
  }
  
  public void setNombre(String n) {
    this.nombre = n;
  }

  public String getRaza() {
    return raza;
  }
  
  public void setRaza(String r) {
    this.raza = r;
  }
  
  public String getSexo() {
    return sexo;
  }
  
  public void setSexo(String s) {
    this.sexo = s;
  }
  public String toString() {
    return  "Nombre: " + this.nombre
            + "Raza: " + this.raza
            + "Sexo: " + this.sexo
            + "\n*************************\n";
  }
  
  /**
   * Hace que el gato maulle.
   */
  public void maulla() {
    System.out.println("Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */ 
  public void ronronea() {
    System.out.println("mrrrrrr");
  }

  /**
   * Hace que el gato coma.
   * A los gatos les gusta el pescado, si le damos otra comida
   * la rechazará.
   * 
   * @param comida la comida que se le ofrece al gato
   */
  public void come(String comida) {
    
    if (comida.equals("pescado")) {
      System.out.println("Hmmmm, gracias");
    } else {
      
      System.out.println("Lo siento, yo solo como pescado");
    }
  }
}

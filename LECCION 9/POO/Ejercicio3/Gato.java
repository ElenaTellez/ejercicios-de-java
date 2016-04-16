package poo.ejercicio3;

/**
 * Gato 
 * Definición de la clase Gato
 * @author Elena Téllez
 */

public class Gato {
  
  private String nombre;
  private String raza;
  private String sexo;
  
   public Gato(String c, String e, String g) {
         
    this.nombre = c;
    this.raza = e;
    this.sexo = c;
       
   }
    
   
  //Metodos
  
  public String toString() {
    return  "Nombre: " + this.nombre
            + "\nRaza: " + this.raza
            + "\nSexo: " + this.sexo
            + "\n*************************\n";
  }
  
  /**
   * Hace que el gato maulle.
   */
  public void maulla() {
    System.out.println("El gato maulla: Miauuuu");
  }

  /**
   * Hace que el gato ronronee
   */ 
  public void ronronea() {
    System.out.println("El gato esta contento y ronronea: mrrrrrr");
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
      System.out.println("El gato se pelea con el pingüino por el pescado.");
    } else {
      
      System.out.println("Lo siento, yo solo como pescado");
    }
  }
}

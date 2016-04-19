/**
 * 
 * Ejercicio 2
 * 
 * Cambia el programa anterior de tal forma que los datos de los gatos se intro-
 * duzcan directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
 * mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
 * “macho”) . Muestra a continuación los datos de todos los gatos utilizando un
 * bucle.
 * 
 * @author Elena Téllez
 */

public class gatoDos {
  
	private String nombre;
	private String color;
	private String raza;
  
  
	public gatoDos (String n, String c, String r){
	  this.nombre = n;
	  this.color = c;
	  this.raza = r;
	}
    
   
	public String getNombre() {
		return nombre;
	}
  
	public void setNombre(String n) {
		this.nombre = n;
	}
	
	public String getColor() {
		return color;
	}
    
	public void setColor(String c) {
		this.color = c;
	}
  
    public String getRaza() {
		return raza;
	}

	public void setRaza(String r) {
		this.raza = r;
	}
  
  
  public String toString() {
    return  "Nombre: " + this.nombre
            + "Color: " + this.color
            + "Raza: " + this.raza
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

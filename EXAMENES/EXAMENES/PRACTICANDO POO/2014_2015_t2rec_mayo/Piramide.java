/**
 * Crea la clase abstracta Figura con el atributo caracter, que indicará el carácter con el que se debe
 * pintar la figura por pantalla. Crea, a su vez, las clases Rectangulo - con los atributos base y altura – y
 * Piramide – con el atributo altura - como subclases de Figura. Implementa el método toString() para
 * Rectangulo y para Piramide de tal forma que se puedan pintar por pantalla las figuras (huecas)
 * mediante print o println. Debe haber tres variables de clase llamadas figurasCreadas,
 * rectangulosCreados y piramidesCreadas (colócalas donde corresponda) con sus correspondientes
 * getter. Prueba estas clases en un programa para comprobar que todo funciona bien.
 *    
 *  @author Elena Téllez 
 */

public class Piramide {
	
	int alturaInicial;
    
  public Piramide(int l) {
    this.alturaInicial = l;
  }
  
  void setAlturaInicial(int l) {
    this.alturaInicial = l;
  }
  
  @Override
  public String toString() {
	  
		int altura = 1;
    int espacios = alturaInicial - 1;
    int i = 0;
    int relleno = 0;
    String piramide = "";
    
    while (altura < alturaInicial) {
      
      for (i = 1; i <= espacios; i++) {
        piramide += "  ";
      }
      piramide += "██";
      for (i = 1; i < relleno; i++) {
        piramide += "  ";
      }
      if (altura > 1) {
        piramide += "██";
      }
        
      piramide += "\n";
      espacios--;
      altura++;
      relleno = relleno + 2;;
    }
  
    for (i = 1; i < (alturaInicial * 2); i++) {
      piramide += "██";
    }
    piramide += "\n";
    return piramide;
  }
}

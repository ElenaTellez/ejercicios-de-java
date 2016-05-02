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

public class Rectangulo {
  
  private int base;
  private int altura;
    
  public Rectangulo(int l, int h) {
    this.base = l;
    this.altura = h;
  }
  
  void setBase(int l) {
    this.base = l;
  }
  
  void setAltura(int h) {
    this.altura = h;
  }
  
  public String toString() {
    
    int espaciosInteriores = this.base - 2;		
    String resultado = "";	
		        
    for (int i = 0; i < this.base; i++) {    
		resultado += "██"; //Imprime primera linea   
    }
    
    resultado += "\n";	
      
    for (int i = 0; i < this.altura - 2 ; i++) {		
		resultado += "██";  			
			for (int j = 0; j < espaciosInteriores; j++) { //espacios interiores
				resultado += "  ";	
				}	
		resultado += "██"; 
		resultado += "\n";			
	}	
	 
    for (int i = 0; i < this.base; i++) {   
      resultado += "██"; //Imprime ultima linea                
      
    }  
    return resultado;
  }
}

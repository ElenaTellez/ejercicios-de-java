/**
 * Crea la clase abstracta Figura con el atributo caracter, que indicará el carácter con el que se debe
 * pintar la figura por pantalla. 
 * Crea, a su vez, las clases Rectangulo - con los atributos base y altura – 
 * y Piramide – con el atributo altura - como subclases de Figura.
 * Implementa el método toString() para Rectangulo y para Piramide de tal forma que se puedan pintar por pantalla las figuras (huecas)
 * mediante print o println. 
 * Debe haber tres variables de clase llamadas figurasCreadas, rectangulosCreados y piramidesCreadas (colócalas donde corresponda) 
 * con sus correspondientes getter. 
 * 
 * Prueba estas clases en un programa para comprobar que todo funciona bien.
 *    
 *  @author Elena Téllez 
 */

public class PruebaFiguras {
  public static void main(String[] args) {
    
    Cuadrado miCuadradito = new Cuadrado(5);    
    Piramide miPiramide = new Piramide(5); 
    Rectangulo miRectangulo = new Rectangulo(8, 4);
    System.out.println(miPiramide); 
    System.out.println(miCuadradito);
    miCuadradito.setLado(10);
    System.out.println(miCuadradito);
    System.out.println(miRectangulo);
        
  }
}

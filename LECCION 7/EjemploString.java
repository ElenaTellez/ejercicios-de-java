/**
 * Ejemplo de uso de arrays
 * ArrayString
 * @author Luis José Sánchez
 */

public class EjemploString {
  public static void main(String[] args) {
        
    String[]color = {"verde", "rojo", "azul"}; //cadena de caracteres dobles comillas si es un solo caracter comillas simples
        
    System.out.println("Mis colores:" + color[0] + ", " +  color[1] + " y " + color[2]);
    
    
    for (int i = 0; i < color.length; i++) {
      System.out.println("que bonito es el " + color[i]);
    }
  }
}

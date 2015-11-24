/**
 * Ejercicio 8
 *
 * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un
determinado año y que muestre a continuación un diagrama de barras horizontales con
esos datos. Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro
carácter.
 * 
 * @author Elena Téllez
 */

public class Ejer0807{
  public static void main(String[] args) {
    
    String[]meses = {"enero", "febrero", "marzo" , "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"}; 
    int[]media = new int[12];
    
   
        
    for (int i = 0; i < 12; i++) {
      
    System.out.print("Introduce la temperatura media de " + meses[i] + ":");
    media[i] = Integer.parseInt(System.console().readLine());
    }
   
    for (int x = 0; x < 12; x++) {
      
      System.out.printf("%13s",meses[x]);
      System.out.print(": ");
        
      for (int i = 1; i <= media[x]; i++) {//para i menor que el valor del array 0 ya que a X le he dado valor 0 en el for
      
        System.out.print("█");
      }
      
      System.out.print(media[x] + "º");
      System.out.println();
    }  
    
    
    
  }
}

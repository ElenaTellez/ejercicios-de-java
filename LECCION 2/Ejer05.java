/**
 *Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere convertir deberá
 *estar almacenada en una variable.
 *
 *@author Javier Bernal
 * 
 */

public class Ejer05 { 
  public static void main(String[] args) {
    
    double peseta = 500;
    double euro = peseta / 166.386;

    System.out.print(euro + "€ equivale en pesatas a " + peseta + "pts");
  }
}

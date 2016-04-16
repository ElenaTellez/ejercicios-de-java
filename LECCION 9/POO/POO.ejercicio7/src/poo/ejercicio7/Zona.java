package poo.ejercicio7;

/**
 * Definición de la clase Zona
 * 
 * @author Elena Tellez
 */
public class Zona {
  
  private int entradasPorVender;
  
  public Zona(int n){
    entradasPorVender = n;
  }
  
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  /**
   * Vende un número de entradas.
   *  
   * Comprueba si quedan entradas libres antes de realizar la venta.
   * 
   * @param n número de entradas a vender
   */
  public void vender(int j) {
    
    if (this.entradasPorVender == 0) {
      System.out.println("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < j) {
      System.out.println("Sólo me quedan " + this.entradasPorVender
                          + " entradas para esa zona.");
    }
    
    if (this.entradasPorVender >= j) {
      entradasPorVender -= j;
      System.out.println("Aquí tiene sus " + j + " entradas, gracias.");
    }
  }
}

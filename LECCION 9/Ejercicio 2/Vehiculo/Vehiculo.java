package Vehiculo;

/**
 * Ejercicio 2
 * 
 * Definición de la Vehiculo
 * 
 * @author Elena Téllez
 * 
 */


public class Vehiculo {

  // atributos /////////////////////////////
 
 
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;
  private int kilometrosRecorridos = 0;

    
  // métodos ///////////////////////////////   
  
  // constructor
  
   public Vehiculo () {
    this.kilometrosRecorridos=0;
    Vehiculo.vehiculosCreados++;
  }
  
  // consultar
   
  public static int getVehiculosCreados() {
    return Vehiculo.vehiculosCreados;
  } 
  public int getkilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getkilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  
// no envia nada solo presenta muestra los Kilometros //////

  public void andar(int kilometrosRecorridos) {
    this.kilometrosRecorridos += kilometrosRecorridos;
    Vehiculo.kilometrosTotales += kilometrosRecorridos;
 
  }
}

/**
 * Caballo.java
 * Definición de la clase Caballo
 * @author Elena Téllez
 */

public class Caballo {

  // atributos /////////////////////////////
  
  String nombre;
  String raza;
  String sexo;
  int    edad;
  double peso;
  
  // métodos ///////////////////////////////
  
  // constructor
  Caballo (String s, String n) {
    this.sexo = s;
    this.nombre = n;
  }
    
  // getter
  String getSexo() {
    return this.sexo;
  }
  
     
  // getter
  String getNombre() {
    return this.nombre;
  }
  
  /**
   * Hace que el caballo trote
   */
  void trota() {
    System.out.println("El caballo trota");
  }

  /**
   * Hace que el caballo relinche
   */  
  void relincha() {
    System.out.println("relincha");
  }
  
  /**
   * Hace que el gato manzanas
   * A los caballos les gusta las manzanas, si le damos otra comida
   * la rechazará.
   * 
   * @param comida la comida que se le ofrece al caballo 
   */
  void come(String comida) {
    if (comida.equals("manzana")) {
      System.out.println("El caballo salta de alegría");
    } else {
      System.out.println("El caballo te da una patada");
    }
  }

  /**
   * Pone a pelear dos gatos.
   * Solo se van a pelear dos machos entre sí.
   * 
   * @param contrincante es el gato contra el que pelear
   */
  void compiteCon(Caballo contrincante) {
    if (this.sexo.equals("hembra")) {
      System.out.println("La yegua gana la carrera");
    } else {
      if (contrincante.getSexo().equals("macho")) {
        System.out.println("Los dos caballos empatan");
      } else {
        System.out.println("Ha sido una carrera rapida");
      }
    }
  }
}

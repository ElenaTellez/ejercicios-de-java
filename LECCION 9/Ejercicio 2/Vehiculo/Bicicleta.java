package Vehiculo;

/**
 * Ejercicio 2
 * 
 * Definición de la Bicicleta
 * 
 * @author Elena Téllez
 */

public class Bicicleta extends Vehiculo{
 //variables 
 private int platos;
  
 //constructor///// 
 public Bicicleta(int p){
  // super();
   this.platos = p;
 } // no es necesario porque no se va a cambiar ningun atributo

//metodos////////////////
 public void hacerElCaballito(){
   System.out.println("Mira que no me caigo, estoy haciendo el caballito");
}

 

}

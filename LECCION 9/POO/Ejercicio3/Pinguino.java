
package poo.ejercicio3;

import poo.ejercicio3.Ave;

import poo.ejercicio3.Animal;

/**
 * Clase Pinguino que hereda metodos de Ave
 * 
 * @author Elena Téllez
 */
public class Pinguino extends Ave {
    
    //atributos de Pinguino
    
    private String raza; // edad del canario

    public Pinguino(String a) {
        super();
        this.raza = a;
    }
    
    //metodos
    
    /**
     *
     * describe que come el pingüino
     * 
     */
    
    public void comePescado() {
        System.out.println("El pinguino come pescado del mar.");
    }

    /**
     * Describe un nido
     *
     * @param m material del nido
     *
     */
   
    @Override

    public void haceNido(String m) {
        System.out.println("El pingüino no hace nido de " + m + " ,porque vive en la nieve.");
    }

    /**
     *
     * descripción Canario segun metodo de la clase Ave
     *
     * @param c color y t tamano
     *
     }*/   
    
    public String toString() {       
        
        String tamano = "mediano";
        String color = "blanco y negro";
        
        return tamano + " y " + color;
    }
    
    @Override
    
    /**
     * Los animales nacen
     */
    public void nacer() {

        System.out.println("- nace: ¡rompiedo el cascaron!.");
    }
    
    @Override
    
    /**
     * Los animales crecen
     */
    public void crecer() {

        System.out.println("- crece: cambian mis plumas.");
    }
    
    @Override

    /**
     * Los animales mueren
     */
    public void morir() {

        System.out.println("- muere: He tenido una vida plena.");
    }
     
    
}
    

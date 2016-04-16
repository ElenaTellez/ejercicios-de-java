package poo.ejercicio3;

/**
 *
 * Definición de la superclase Animal
 *
 * @author Elena Tellez
 */
public class Animal {

    // atributos
    
    String tipo;
    private Sexo sexo;

  public Animal () {
    this.sexo = Sexo.MACHO;
  }

  public Animal (Sexo s) {
    this.sexo = s;
  }

  public Sexo getSexo() {
    return this.sexo;
  }

    // métodos
    
    /**
     * Los animales nacen
     */
    public String toString() {

        String caracteristica = "";

        caracteristica = "Los animales nacen, crecen, se reproducen y mueren.";

        return caracteristica;
    }

    /**
     * Los animales nacen
     */
    public void nacer() {

        System.out.println("- nacen: ¡Que bello es vivir!");
    }

    /**
     * Los animales crecen
     */
    public void crecer() {

        System.out.println(" - crecen: Me hago mayor");
    }

    /**
     * Los animales mueren
     */
    public void morir() {

        System.out.println(" - mueren: Llego mi hora");
    }

}

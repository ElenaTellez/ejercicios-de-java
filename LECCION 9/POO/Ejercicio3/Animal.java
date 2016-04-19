
/**
 *
 * Definición de la superclase Animal
 *
 * @author Elena Tellez
 */
public class Animal {

    // atributos
    
    private String tamano = "grande";
    private String color = "negra";
    
    String tipo;
    private Sexo sexo;
    
    public Animal (String c, String t){
		this.color = c;
		this.tamano = t;
	}

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
     
    public void caracteristica() {

        System.out.println("Los animales nacen, crecen, se reproducen y mueren.");

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

        System.out.println("- crecen: Me hago mayor");
    }

    /**
     * Los animales mueren
     */
    public void morir() {

        System.out.println("- mueren: Llego mi hora");
    }
    
    /**
     *
     * descripción Ave
     *
     * @param c color y t tamano
     *
     */
    public String toString() {
        return tamano + " y " + color;
    }

}

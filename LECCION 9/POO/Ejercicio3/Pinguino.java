
/**
 * Clase Pinguino que hereda metodos de Ave
 * 
 * @author Elena Téllez
 */
public class Pinguino extends Ave {
    
    //atributos de Pinguino
    
    private String raza; // edad del canario

    public Pinguino(String a, String c, String t) {
        super(c, t);
        this.raza = a;
    }
    
         
    //metodos
    public String getRaza(){
		return raza;
	}
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
        System.out.println("El pingüino no hace nido de " + m + " porque vive en la nieve.");
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
    

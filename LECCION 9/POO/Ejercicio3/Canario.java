
public class Canario extends Ave {
    
    //atributos de Canario
    
    private int edad; // edad del canario

    public Canario(int a) {
        super();
        this.edad = a;
    }
    
    public Canario(String c, String t) {
        super(c, t);        
    }
    
    public Canario(String c, String t, int a) {
        super(c, t);
        this.edad = a;        
    }

       
    //metodos
    
    /**
     * describe cuando canta el pajaro
     */
    
    public void canta() {
        System.out.println("El canario canta todas las mañanas.");
    }

    /**
     * Describe un nido
     *
     * @param m material del nido
     *
     */
   
    @Override

    public void haceNido(String m) {
        System.out.println("El canario no hace nido de " + m + " porque está enjaulado");
    }

    /**
     *
     * descripción Canario segun metodo de la clase Ave
     *
     * @param c color y t tamano
     *
     }*/
    
    public String toString() {       
        
        String tamano = "pequeño";
        String color = "amarillo";
        
        return tamano + " y " + color;
    }
     
    
}

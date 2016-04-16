package poo.ejercicio5;

/**
 * Ejercicio 5
 *
 * Crea la clase Pizza con los atributos y métodos necesarios. Sobre cada pizza
 * se necesita saber el tamaño - mediana o familiar - el tipo - margarita,
 * cuatro quesos o funghi - y su estado - pedida o servida. La clase debe
 * almacenar información sobre el número total de pizzas que se han pedido y que
 * se han servido. Siempre que se crea una pizza nueva, su estado es “pedida”.
 *
 * @author Elena Téllez
 */
public class Pizza {

    private String tamano;
    private String tipo;
    private String estado;

    private static int totalPedidas = 0;
    private static int totalServidas = 0;

    public Pizza(String t, String p) {
        this.tamano = p;
        this.tipo = t;
        this.estado = "pedida";
        Pizza.totalPedidas++;

    }
    
    public static int getTotalPedidas() {
        return Pizza.totalPedidas;
    }

    public static int getTotalServidas() {
        return Pizza.totalServidas;
    }

    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.totalServidas++;
        } else {
            System.out.println("esa pizza ya se ha servido");
        }
    }

    public String toString() {
        return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
    }

    

}

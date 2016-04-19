
public class Ave extends Animal {


    private int metrosVolados;
    private int numeroHuevos;

    private static int cuentaHuevos = 0;
    private static int cuentaMetros = 0;

    public Ave() {
        //tengo que crear un constructor de Ave para las subclases de Canario y Pinguino
    }

    public Ave(String c, String t) {
        super(c, t);        
        this.numeroHuevos = 0;
        this.metrosVolados = 0;
    }

    public int getnumeroHuevos() {
        return this.numeroHuevos;
    }

    public static int getcuentaHuevos() {
        return Ave.cuentaHuevos;
    }

    public int getmetrosVolados() {
        return this.metrosVolados;
    }

    public static int getcuentaMetros() {
        return Ave.cuentaMetros;
    }

    /**
     *
     * suma la distancia recorrida
     *
     * @param k numero de huevos
     *
     */
    public void poneHuevos(int h) {
        this.numeroHuevos += h;
        Ave.cuentaHuevos += h;
    }

    /**
     * cuenta el numero huevos
     *
     * @param k numero de huevos
     *
     */
    public void vuela(int m) {
        this.metrosVolados += m;
        Ave.cuentaMetros += m;
    }

    /**
     * Describe un nido
     *
     * @param m material del nido
     *
     */
    public void haceNido(String m) {
        System.out.println("El ave hizo su nido de " + m);
    }

    

}

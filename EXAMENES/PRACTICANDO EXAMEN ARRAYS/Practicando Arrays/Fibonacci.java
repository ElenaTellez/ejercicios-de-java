/*
 * Cargar un vector de 10 posiciones con los 10 primeros
 * elementos de la serie de Fibonacci y mostrarlo en pantalla.
 */

public class Fibonacci {
    public static void main(String[] args) {
        int v[]= new int[10];
        int a, b;

        a= v[0]= 1;
        b= v[1]= 1;

        System.out.print( "Elementos fibonacci (de 1 a 10): 1, 1,");
        for( int i=2; i<10; i++ ) {
            v[i]= a+ b;
            a=b; b=v[i];
            System.out.print( " "+ v[i]+ ",");
        }
    }

}

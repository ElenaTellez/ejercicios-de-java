

/**
 * Leer 10 números enteros, almacenarlos en un vector
 * y determinar si el promedio entero de estos datos está almacenado en el vector.
 */

public class PromedioEntero {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];
        int prom;
        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        prom=0;
        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
            prom+= v[i]/10;
        }

        int aux=0;
        for( int i=0; i<10; i++ )
            if( prom== v[i] ) aux++;

        System.out.print("El promedio entero es "+ prom+ " y se encuentra "+ aux+ " veces repetido en el vector\n" );
    }
}

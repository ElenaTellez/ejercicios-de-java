

/*
 * Leer 10 números enteros, almacenarlos en un vector
 * y determinar cuántas veces está repetido el mayor.
 */

public class RepeticionesNumMayor {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];
        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
        }

        int mayor= v[0];
        for( int i=1; i<10; i++ )
                if( mayor < v[i] )
                    mayor= v[i];

        int rep=0;
        for( int i=0; i<10; i++ )
            if( v[i]== mayor )
                rep++;

        System.out.print( "El mayor numero ingresado es "+ mayor
                + "\ny se encuentra repetido "+ rep+ " veces.\n" );
    }    
}

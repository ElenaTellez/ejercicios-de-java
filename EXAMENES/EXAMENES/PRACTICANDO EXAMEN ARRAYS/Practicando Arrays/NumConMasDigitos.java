
/**
 * Leer 10 números enteros, almacenarlos en un vector
 * y determinar en qué posición está el número con mas dígitos.
 */

public class NumConMasDigitos {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];
        int aux, n, mayor, pos;

        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
        }


        mayor= pos=0;
        for( int i=0; i<10; i++ ) {
            aux= v[i]; n=0;

            while( aux > 0 ) {
                aux/= 10;
                n++;
            }

            if( mayor < n) {
                mayor= n;
                pos= i;
            }
        }


        System.out.print( "El elemento con mayor digitos es el numero "+ v[pos]
                + " ubicado en la posicion "+ pos +"\n");
    }

}



/**
 * Leer 10 números enteros, almacenarlos en un vector
 * y determinar en qué posición está el número cuya suma de dígitos sea la mayor.
 */

public class SumaDigitos {
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

            while( aux > 9 ) {
                n+= aux%10;
                aux/= 10;
            }
            n+= aux;

            if( mayor < n) {
                mayor= n;
                pos= i;
            }
        }

        
        System.out.print( "El elemento cuya suma de digitos es la mayor es del numero "+ v[pos]
                + " ubicado en la posicion "+ pos +"\n");
    }

}

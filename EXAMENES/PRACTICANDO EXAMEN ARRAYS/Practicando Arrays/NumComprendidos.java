
/**
 * Leer 10 números enteros, almacenarlos en un vector y mostrar
 * en pantalla todos los enteros comprendidos entre 1
 * y cada uno de los números almacenados en el vector.
 */

public class NumComprendidos {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];

        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
        }


        for( int i=0; i<10; i++ ) {
            System.out.print("\n·Los enteros comprendidos entre 1 y "+ v[i]+ " son: ");
            for( int s=2; s<v[i]; s++ )
                System.out.print(""+ s+ ", ");          
        }
    }
}

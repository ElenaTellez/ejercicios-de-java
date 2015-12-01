/**
 * Leer 10 números enteros, almacenarlos en un vector
 * y calcularle el factorial a cada uno de los números leídos almacenándolos en otro vector.
 */

public class Factorial {
    public static void main(String[] args) throws IOException {
		
        int v[]= new int[10];
        Double f[]= new Double[10];
        int aux;

        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        aux=0;
        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
        }

        System.out.print("Vector Ingresado: ");
        for( int i=0; i<10; i++ ) {
            System.out.print(""+ v[i]+ ", " );
            
            aux= v[i];
            f[i]= 1.0;
            while( aux > 0 ) { //factorial
                f[i]*= aux;
                aux--;
            }
        }

        System.out.print("\nFactoriales: ");
        for( int i=0; i<10; i++ )
            System.out.print(""+ f[i]+ ", " );
    }

}

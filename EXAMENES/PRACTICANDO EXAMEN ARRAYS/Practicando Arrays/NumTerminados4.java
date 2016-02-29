


/*
 * Leer 10 números enteros, almacenarlos en un vector
 * y determinar en qué posiciones se encuentran los números terminados en 4.
 */

public class NumTerminados4 {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];
        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
        }

        String posiciones="";
        System.out.print( "Vector almacenado: " );
        for( int i=0; i<10; i++ ) {
            System.out.print( ""+ v[i]+ ", " );
            if( v[i]% 10 == 4 ) posiciones+= i+ ", ";
        }
        System.out.println( "\nposiciones de los numeros terminados en 4: "+ posiciones );
    }

}

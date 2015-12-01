

/**
 * Escriba un algoritmo que a partir de leer y almacenar en vectores el valor
  comercial de 20 vehículos y el tipo (familiar (1), público (2), de carga (3)), calcule y muestre su valor final con base en:
- Para vehículos de valor superior a 100 millones, cobrar IVA de 20%, para los demás el IVA es del 16%
- Para vehículos tipo 1, con valor hasta 50 millones, aplicar descuento equivalente al 50% del IVA cobrado
- Para vehículos tipo 2 y 3, con valor superior a 80 millones, aplicar sobrecosto por impuesto de rodamiento del 5%
- Para todos los vehículos, si el valor final es inferior a 80 millones, aplicar descuento adicional del 5% del valor comercial
*/

public class Vehiculos {
    public static void main(String[] args) throws IOException {
        int n=20; //tamaño del vector
        int vehiculo[][]= new int[n][2];
        
        System.out.println( "Iva aplicado a carros de valor comercial. UCP\nIngrese los siguientes datos para cada vehiculo: ");

        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));
        for( int i=0; i<n; i++ ) {
            System.out.print( "-------------\nVehiculo #"+ (i+1) );
            System.out.print( "\nValor: " );
            vehiculo[i][0]= Integer.parseInt(dato.readLine() );
            System.out.print( "Tipo (1- familiar; 2- publico; 3- de carga): " );
            vehiculo[i][1]= Integer.parseInt(dato.readLine() );
        }

        System.out.println( "------------------------\n#\tValor final\tValor Comercial(original) |" );
        for( int i=0; i<n; i++ ){
            System.out.print( ""+ (i+1) + "\t$");
            int valor= vehiculo[i][0];
            int tipo= vehiculo[i][1];

            if( valor > 100000000 )
                vehiculo[i][0]+= Math.round( valor*20/100 ); //Iva del 20%

            else
                vehiculo[i][0]+= Math.round( valor*16/100 ); //Iva del 16%

            if( tipo == 1 && valor <= 50000000)
                vehiculo[i][0]-= Math.round( valor*8/100 ); //50% del 16%(iva) -> 8% descontado del valor comercial

            else if( valor > 80000000 )
                vehiculo[i][0]+= Math.round( valor*5/100 ); //Impuesto rodamiento 5% sobre valor Comercial

            if( vehiculo[i][0] < 80000000 )
                vehiculo[i][0]-= Math.round( valor*5/100 ); //Descuento del 5% del valor comercial

            System.out.print( vehiculo[i][0]+ "\t$"+ valor+ "\n" );
        }
    }
}

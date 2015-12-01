/**
Con base en una encuesta realizada a N estudiantes (N<=50) en una Universidad donde se solicitó la siguiente información: CÉDULA, SEXO, SUELDO, TRABAJA
Donde:
CEDULA (Es un número entero)
SEXO (1 - Masculino 2 – Femenino)
TRABAJA (1 - Si trabaja 2 - No trabaja)
SUELDO (Es un valor entero)

Escriba el algoritmo que permita leer y almacenar en vectores los datos solicitados, luego, calcular e imprimir:
Porcentaje de hombres en la Universidad (0)
Porcentaje de mujeres en la Universidad (1)
Porcentaje de hombres que trabajan(2) y sueldo promedio(3)
Porcentaje de mujeres que trabajan(4) y sueldo promedio(5)
*/

public class Encuesta {
    public static void main(String[] args) throws IOException {
        //n: numero de estudiantes
        int n=15;
        int estudiante[][]= new int[n][4]; //Array 2D
        Double promedios[]= {0.0, 0.0, 0.0, 0.0, 0.D0, 0.0};

        System.out.println( "Encuenta UCP");

        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los datos para cada uno de los estudiantes: ");

        for( int i=0; i<n; i++ ) {
            System.out.print( "---------------------------------------\n");
            System.out.print( "Estudiante #"+ (i+1) + "\n");

            System.out.print( "Cedula: ");
            estudiante[i][0]= Integer.parseInt( dato.readLine() );

            System.out.print( "Sexo (1-Masculino; 2-Femenino): ");
            estudiante[i][1]= Integer.parseInt( dato.readLine() );
            
            System.out.print( "Trabaja (1- Si; 2-No): ");
            estudiante[i][2]= Integer.parseInt( dato.readLine() );

            System.out.print( "Sueldo: ");
            estudiante[i][3]= Integer.parseInt( dato.readLine() );
        }

        for( int i=0; i<n; i++ ) {
            if( estudiante[i][1] == 1 ) {
                promedios[0] += 1;
                if( estudiante[i][2]== 1 ) {
                    promedios[2]+= 1;
                    promedios[3]+= estudiante[i][3];
                }
            }
            else {
                promedios[1]+= 1;
                if( estudiante[i][2]== 1 ) {
                    promedios[4]+= 1;
                    promedios[5]+= estudiante[i][3];
                }
            }
        }

        System.out.print( "\n--------------------\n--------------------\n");
        System.out.print( "De "+ n+ " estudiantes encuestados...\n" +
                Math.round(promedios[0]/n*100)+ "% son hombres, de los cuales el "+ Math.round(promedios[2]/n*100)+
                "% trabajan devengando un sueldo promedio de $"+ Math.round(promedios[3]/n)+ "\n"+
                "El restante "+ Math.round(promedios[1]/n*100)+ "% son mujeres de las cuales el "+ Math.round(promedios[4]/n*100)+
                "% trabajan devengando un sueldo promedio de $"+ Math.round(promedios[5]/n)+ "\n");
    }
}

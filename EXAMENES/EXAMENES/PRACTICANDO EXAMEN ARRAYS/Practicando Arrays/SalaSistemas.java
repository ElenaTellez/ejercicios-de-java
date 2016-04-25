

/**
 *El Departamento de Sistemas de la UCPR cuenta con cinco salas de sistemas, cada una de ellas
con 20 computadores. Se requiere sistematizar el proceso de reserva o cancelación de turnos para
dichas salas en el horario disponible (12 a 2 pm, únicamente), los demás horarios están reservados para clases.
Construya un algoritmo que solicite al usuario la siguiente información (sala, equipo), tanto para asignar
turno como para cancelarlo. Igualmente, el programa deberá permitir conocer el número de equipos
disponibles (sin asignar) por sala, y el número total de turnos asignado (todas las salas).
Tenga en cuenta que el algoritmo deberá funcionar permanentemente mostrando un menú de opciones así:
1. Asignar o cancelar turno
2. Cantidad de equipos disponibles por sala
3. cantidad de turnos asignados en toda la U
4. Salir
*/

public class SalaSistemas {
    public static void main(String[] args) throws IOException {
        int n=20; //total de equipos
        int sala[][]= new int[n][5]; //equiposxsalas
        int  equiposDisponibles[]= {n, n, n, n, n }, turnosAsignados=0;
        boolean salir;

        // 0: equipo disponible, 1: ocupado
        //inicializacion de todos los equipos en 0
        for( int i=0; i<n; i++ )
            for( int j=0; j<5; j++ )
                sala[i][j]= 0;

        salir= false;
        while( !salir ) {
            int op, nSala, equipo;
            System.out.print( "\n----------------------\n"+
                    "Por favor elija una de las siguientes opciones:\n"+
                    "1. Asignar o cancelar turno\n"+
                    "2. Cantidad de equipos disponibles por sala\n"+
                    "3. cantidad de turnos asignados en toda la U\n"+
                    "4. Salir" );
            BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));
            op= Integer.parseInt( dato.readLine() );

            switch( op ) {
                case 1 : //asignar, cancelar
                    System.out.print("------------------------\nDesea asignar(1) o cancelar(2) turno?: ");
                    op= Integer.parseInt( dato.readLine() );
                    if( op == 1 || op== 2 ) {
                        System.out.print("Numero de la sala: ");
                        nSala= Integer.parseInt( dato.readLine() );
                        System.out.print("Numero del equipo: ");
                        equipo= Integer.parseInt( dato.readLine() );

                        if( op == 1 && equiposDisponibles[nSala]> 0 ) {
                            if( sala[equipo][nSala]== 0 ) {
                                sala[equipo][nSala]=1;
                                System.out.print("Asignacion exitosa!\n");
                                equiposDisponibles[nSala]-= 1;
                                turnosAsignados+= 1;
                            }
                            else System.out.print("El equipo ya esta asignado!\n");
                        }
                        else if( op== 2 ) {
                            if( sala[equipo][nSala]== 1 ) {
                                sala[equipo][nSala]=0;
                                System.out.print("Cancelacion exitosa!\n");
                                equiposDisponibles[nSala]+= 1;
                                turnosAsignados-= 1;
                            }
                            else System.out.print("El equipo no esta asignado, no es posible cancelar!\n");
                        }
                        else
                            System.out.print("\nNo hay equipos disponibles en esa sala!!");
                    }
                    else System.out.print("ERROR! opcion invalida, solo 1 o 2!\n");
                    break;

                case 2 : //cantidad de equipos dispo por sala
                    System.out.print("\nEquipos disponibles por sala...\n");
                    for( int i=0; i<5; i++ )
                        System.out.print("Sala "+ i+ ": "+ equiposDisponibles[i]+ " equipos.\n" );
                    break;

                case 3 : //Cantidad turnos asignado toda la U
                    System.out.print("\nLa cantidad de turnos asignados en toda la U es de "+ turnosAsignados
                            + " turnos.\n");
                    break;

                case 4:
                    salir= true;
                    break;

                default :
                    System.out.print("\nERROR! Ingrese un numero valido, solo de 1 a 4!!\n" );
            }
        }
    }
}


/*
 *      NumTerminados15.java
 *      
 *      Copyright 2009 Jonathan Alvarez <jonas.al.co@gmail.com>
 *      Archivo disbruido con fines de aprendizaje.
 * 		puedes modificar y resdistrubuir el archivo, solo manten intacta
 * 		la notificacion de licencia.
 *      
 *      This program is free software; you can redistribute it and/or modify
 *      it under the terms of the GNU General Public License as published by
 *      the Free Software Foundation; either version 2 of the License, or
 *      (at your option) any later version.
 *      
 *      This program is distributed in the hope that it will be useful,
 *      but WITHOUT ANY WARRANTY; without even the implied warranty of
 *      MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *      GNU General Public License for more details.


/**
 * Leer 10 números enteros, almacenarlos en un vector y
 * determinar cuántos números de los almacenados en dicho vector terminan en 15.
 */

public class NumTerminados15 {
    public static void main(String[] args) throws IOException {
        int v[]= new int[10];
        BufferedReader dato= new BufferedReader( new InputStreamReader( System.in ));

        System.out.println( "Ingrese los elementos del vecor...");

        for( int i=0; i<10; i++ ) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt( dato.readLine() );
        }

        int aux=0;
        System.out.print( "Vector almacenado: " );
        for( int i=0; i<10; i++ ) {
            System.out.print( ""+ v[i]+ ", " );
            if( v[i]% 100 == 15 ) aux++;
        }
        System.out.println( "\nEn total, "+ aux+ " numeros terminan en 15" );
    }

}

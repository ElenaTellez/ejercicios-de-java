package pruebaArrayBi;

import java.util.Scanner;

import matematicas.funcionesBi;

import matematicas.funcionesUni;

/**
 * Ejercicio 29-34
 * 
 * Crea una biblioteca de funciones para arrays bidimensionales (de dos dimen-
 * siones) de números enteros que contenga las siguientes funciones:
 * 
 * 1. generaArrayBiInt: Genera un array de tamaño n x m con números
 * aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
 * 
 * 2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
 * parámetro.
 * 
 * 3. columnaDeArrayBiInt: Devuelve la columna j-ésima del array que se
 * pasa como parámetro.
 * 
 * 4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
 * con dos elementos) de la primera ocurrencia de un número dentro de un
 * array bidimensional. Si el número no se encuentra en el array, la función
 * devuelve el array {-1, -1}.
 * 
 * 5.esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
 * mínimo en su fila y máximo en su columna.
 * 
 * @author Elena Tellez
 */
public class diagonal {
  public static void main(String[] args) {
    
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca el numero de filas del array: ");		
	
	int filas = sc.nextInt();
		
	System.out.print("Introduzca el numero de columnas del array: ");		
		 	
	int columnas = sc.nextInt();
  
  System.out.print("Introduzca el numero minimo del intervalo del array: ");		
		 	
	int min = sc.nextInt();
		
	System.out.print("Introduzca el numero máximo del intervalo del array: ");		
	 	
	int max = sc.nextInt();	
  
  int a [][] = matematicas.funcionesBi.generaArrayBi(filas,columnas, min, max);
  
  matematicas.funcionesBi.muestraArrayBi(a, filas, columnas);
  
  System.out.print("Introduzca el numero de fila del array a mostrar: ");		
	
	int filaElegida = sc.nextInt();
  
  matematicas.funcionesUni.muestraArrayInt(matematicas.funcionesBi.filaArrayBi(a,filaElegida));
  
  System.out.print("Introduzca el numero de columna del array a mostrar: ");		
	
	int columnaElegida = sc.nextInt();
  
  matematicas.funcionesUni.muestraArrayInt(matematicas.funcionesBi.columnaArrayBi(a,columnaElegida));
  
  //si quiero mostrar valores columnas en vertical no uso funcion muestraArrayInt
  
  System.out.print("Introduzca  un numero y si se encuentra apareceran las coordenadas del mismo: ");
  
  int ocurrencia = sc.nextInt();
  
  matematicas.funcionesUni.muestraArrayInt(matematicas.funcionesBi.estaEnArrayBi(a,ocurrencia));
  
  System.out.print("Introduzca  un numero de fila y le diremos si es punto de silla en Array: ");
  
  int filaSilla = sc.nextInt();
  
  System.out.print("Introduzca  un numero columna y le diremos si es punto de silla en Array: ");
  
  int columnaSilla = sc.nextInt();
  
  System.out.print(matematicas.funcionesBi.esPuntoSilla(a,filaSilla,columnaSilla));
  
  System.out.print("Introduzca  un numero de fila: ");
  
  int filaDiagonal = sc.nextInt();
  
  System.out.print("Introduzca  un numero columna: ");
  
  int columnaDiagonal = sc.nextInt();
  
  System.out.print("Introduzca la direccion de la diagonal nose o neso : ");
  
  String direccion = sc.next();
  
  matematicas.funcionesUni.muestraArrayInt(matematicas.funcionesBi.diagonal(a,filaDiagonal,columnaDiagonal,direccion));
  
  
  sc.close();	
  } 
}

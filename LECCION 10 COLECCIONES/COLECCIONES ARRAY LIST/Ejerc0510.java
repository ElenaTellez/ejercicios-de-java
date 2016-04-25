import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 5
 * 
 * Realiza de nuevo el ejercicio de la colecci�n de discos pero utilizando esta
 * vez una lista para almacenar la informaci�n sobre los discos en lugar de un
 * array convencional. Comprobar�s que el c�digo se simplifica notablemente
 * �Cu�nto ocupa el programa original hecho con un array? �Cu�nto ocupa este
 * nuevo programa hecho con una lista?
 * 
 * @author Elena Tellez
 */

public class Ejerc0510 {

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		    
	    int i;
	    String codigoIntroducido;
	    String autorIntroducido;
	    String tituloIntroducido;
	    String generoIntroducido;
	    String duracionIntroducidaString;
	    int opcion;
	    int opcionListado;
	    int duracionIntroducida;
	    int limiteInferior;
	    int limiteSuperior;

		// Crea el array list de discos
		
		ArrayList<Disco> album = new ArrayList<Disco>();
		
		// DISCOS PREDEFINIDOS
	    album.add(new Disco("GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
	    album.add(new Disco("FGHQ64", "Metallica", "Black album", "hard rock", 46));
	    album.add(new Disco("TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));

	    // MEN�
	    do {
	      System.out.println("\n\nCOLECCI�N DE DISCOS");
	      System.out.println("===================");
	      System.out.println("1. Listado");
	      System.out.println("2. Nuevo disco");
	      System.out.println("3. Modificar");
	      System.out.println("4. Borrar");
	      System.out.println("5. Salir");
	      System.out.print("Introduzca una opci�n: ");
	      opcion = Integer.parseInt(sc.nextLine());
	      
	      switch (opcion) {
	      
	      // LISTADO //////////////////////////////////////////////////////////////////
	      case 1:
	        do {
	          System.out.println("\nLISTADO\n=======");
	          System.out.println("1. Completo");
	          System.out.println("2. Por autor");
	          System.out.println("3. Por g�nero");
	          System.out.println("4. En un rango de duraci�n");
	          System.out.println("5. Men� principal");
	          System.out.print("Introduzca una opci�n: ");
	          opcionListado = Integer.parseInt(sc.nextLine());        
	          
	          switch (opcionListado) {

	            case 1: // Listado completo ////////////////    
	              
	              for(Disco d : album) {
	                System.out.println(d);
	              }              
	              break;
	                    
	            case 2: // Listado por autor ////////////////
	  
	              System.out.print("Introduzca el autor: ");
	              autorIntroducido = sc.nextLine();
	              
	              for(Disco d : album) {
	                if(d.getAutor().equals(autorIntroducido)) {
	                  System.out.println(d);
	                }
	              }
	              break;
	              
	            case 3: // Listado por g�nero ////////////////
	  
	              System.out.print("Introduzca el g�nero: ");
	              generoIntroducido = sc.nextLine();
	              
	              for(Disco d : album) {
	                if(d.getGenero().equals(generoIntroducido)) {
	                  System.out.println(d);
	                }
	              }              
	              break;
	  
	            case 4: // Listado en un rango de duraci�n ////
	  
	              System.out.println("Establezca el intervalo para la duraci�n");
	              System.out.print("Introduzca el l�mite inferior de duraci�n en minutos: ");
	              limiteInferior = Integer.parseInt(sc.nextLine());
	              System.out.print("Introduzca el l�mite superior de duraci�n en minutos: ");
	              limiteSuperior = Integer.parseInt(sc.nextLine());

	              for(Disco d : album) {
	                if((d.getDuracion() <= limiteSuperior) && (d.getDuracion() >= limiteInferior)) {
	                  System.out.println(d);
	                }
	              }          
	          } // switch (opcionListado)
	    
	        } while (opcionListado != 5);

	        break;
	      
	      // NUEVO DISCO //////////////////////////////////////////////////////////////
	      case 2:
	        System.out.println("\nNUEVO DISCO\n===========");

	        System.out.println("Por favor, introduzca los datos del disco.");  
	        System.out.print("C�digo: ");
	        codigoIntroducido = sc.nextLine();

	        while (album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
	          System.out.println("Ese c�digo ya existe en la base de datos.");
	          System.out.print("Introduzca otro c�digo: ");
	          codigoIntroducido = sc.nextLine();
	        }
	        
	        System.out.print("Autor: ");
	        autorIntroducido = sc.nextLine();        
	        System.out.print("T�tulo: ");
	        tituloIntroducido = sc.nextLine();      
	        System.out.print("G�nero: ");
	        generoIntroducido = sc.nextLine();      
	        System.out.print("Duraci�n: ");
	        duracionIntroducida = Integer.parseInt(sc.nextLine());
	        
	        album.add(new Disco(codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido, duracionIntroducida));
	        
	        break;
	        
	      // MODIFICAR ////////////////////////////////////////////////////////////////      
	      case 3:
	        System.out.println("\nMODIFICAR\n===========");
	        
	        System.out.print("Por favor, introduzca el c�digo del disco cuyos datos desea cambiar: ");
	        codigoIntroducido = sc.nextLine();

	        while (!album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
	          System.out.print("Ese c�digo no existe.\nIntroduzca otro c�digo: ");
	          codigoIntroducido = sc.nextLine();
	        }  
	        i = album.indexOf(new Disco(codigoIntroducido,"", "", "", 0));
	        
	        System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
	  
	        System.out.println("C�digo: " + album.get(i).getCodigo());
	        System.out.print("Nuevo c�digo: ");
	        codigoIntroducido = sc.nextLine();
	        if (!codigoIntroducido.equals("")) {
	          album.get(i).setCodigo(codigoIntroducido);
	        }
	        
	        System.out.println("Autor: " + album.get(i).getAutor());
	        System.out.print("Nuevo autor: ");
	        autorIntroducido = sc.nextLine();
	        if (!autorIntroducido.equals("")) {
	          album.get(i).setAutor(autorIntroducido);
	        }
	        
	        System.out.println("T�tulo: " + album.get(i).getTitulo());
	        System.out.print("Nuevo t�tulo: ");
	        tituloIntroducido = sc.nextLine();
	        if (!tituloIntroducido.equals("")) {
	          album.get(i).setTitulo(tituloIntroducido);
	        }
	        
	        System.out.println("G�nero: " + album.get(i).getGenero());
	        System.out.print("Nuevo g�nero: ");
	        generoIntroducido = sc.nextLine();
	        if (!generoIntroducido.equals("")) {
	          album.get(i).setGenero(generoIntroducido);
	        }
	        
	        System.out.println("Duraci�n: " + album.get(i).getDuracion());
	        System.out.print("Duraci�n: ");
	        duracionIntroducidaString = sc.nextLine();
	        if (!duracionIntroducidaString.equals("")) {
	          album.get(i).setDuracion(Integer.parseInt(duracionIntroducidaString));
	        }
	        
	        break;

	      // BORRAR ///////////////////////////////////////////////////////////////////      
	      case 4:
	        System.out.println("\nBORRAR\n======");
	        
	        System.out.print("Por favor, introduzca el c�digo del disco que desea borrar: ");
	        codigoIntroducido = sc.nextLine();

	        if (!album.contains(new Disco(codigoIntroducido,"", "", "", 0))) {
	          System.out.println("Lo siento, el c�digo introducido no existe.");
	        } else {
	          album.remove(album.indexOf(new Disco(codigoIntroducido,"", "", "", 0)));
	          System.out.println("Album borrado.");
	        }
	      } // switch    
	    } while (opcion != 5);
	    sc.close();
	  }
	}

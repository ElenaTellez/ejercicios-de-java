import java.util.HashMap;
import java.util.Scanner;


/** Ejercicio 6
 * 
 * Implementa el control de acceso al �rea restringida de un programa. Se debe
 * pedir un nombre de usuario y una contrase�a. Si el usuario introduce los
 * datos correctamente, el programa dir� �Ha accedido al �rea restringida�. El
 * usuario tendr� un m�ximo de 3 oportunidades. Si se agotan las oportunidades
 * el programa dir� �Lo siento, no tiene acceso al �rea restringida�. Los nombres
 * de usuario con sus correspondientes contrase�as deben estar almacenados
 * en una estructura de la clase HashMap.
 * 
 * @author: Elena T�llez
 * 
 */

public class Ejerc0610 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 HashMap<String, String> m = new HashMap<String, String>();
	        
		    String usuario;
		    String clave;
		    boolean entra = false;
		    int oportunidades = 3;

		    m.put("admin", "224477");
		    m.put("maria", "ztf99");      
		    m.put("pepe", "zxcvb");

		    System.out.println("Por favor, introduzca nombre de usuario y "
		          + "contrase�a para acceder al �rea restringida.\nDispone de "
		          + "3 intentos.");

		    do {
		      System.out.print("Usuario: ");
		      usuario = sc.nextLine();    
		      System.out.print("Contrase�a: ");
		      clave = sc.nextLine();
		      
		      if (m.containsKey(usuario)) { // el usuario existe
		        if (m.get(usuario).equals(clave)) {
		          System.out.println("Ha accedido al �rea restringida");
		          entra = true;
		        } else {
		          System.out.println("Contrase�a incorrecta");
		        }
		      } else { // el usuario no existe
		        System.out.println("El usuario introducido no existe");
		      }
		      
		      oportunidades--;
		      
		      if (!entra && (oportunidades > 0)) {
		        System.out.println("Le quedan " + (oportunidades) + " oportunidades");
		      }
		      
		    } while ((!entra) && (oportunidades > 0));

		    if (!entra){
		      System.out.print("Lo siento, no tiene acceso al �rea restringida");
		    }
		    
		    sc.close();
		  }
		}
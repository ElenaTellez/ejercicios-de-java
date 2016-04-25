import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



/**
 * Realiza un buscador de sin�nimos. Puedes aprovechar el diccionario
 * espa�ol-ingl�s utilizado en los ejercicios de clase, modific�ndolo o
 * ampli�ndolo convenientemente. El programa preguntar� una palabra y dar� una
 * lista de sin�nimos (palabras que tienen el mismo significado). Por ejemplo,
 * si se introduce la palabra �caliente�, el programa dar� como resultado:
 * ardiente, candente, abrasador. �C�mo sabe el programa cu�les son los
 * sin�nimos de �caliente�? Muy f�cil, en el diccionario debe existir la entrada
 * (�caliente�, �hot�), por tanto solo tendr� que buscar las palabras en espa�ol
 * que tambi�n signifiquen �hot�; esta informaci�n estar� en las entradas
 * (�ardiente�, �hot�), (�candente�, �hot�) y (�abrasador�, �hot�). Adem�s de
 * dar la lista de sin�nimos, el programa debe ser capaz de aprender. Cuando una
 * palabra no tiene sin�nimos, se le preguntar� al usuario si quiere a�adir uno
 * y, en caso afirmativo, se pedir� la palabra y se a�adir� al diccionario.
 * 
 * @author Elena T�llez
 *
 */

public class Ejer03Ex2015 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		HashMap<String, String> m = new HashMap<String, String>();
		HashMap<String, String> aux = new HashMap<String, String>();

		m.put("caliente", "hot");
		m.put("ardiente", "hot");
		m.put("candente", "hot");
		m.put("abrasador", "hot");
		m.put("frío", "cold");
		m.put("gélido", "cold");
		m.put("helado", "cold");
		m.put("simpatico", "fun");
		m.put("alegre", "fun");
		m.put("divertido", "fun");
		m.put("listo", "clever");
		m.put("inteligente", "clever");
		m.put("tonto", "silly");
		m.put("torpe", "silly");
		m.put("lento", "silly");
		m.put("guapa", "pretty");
		m.put("feo", "ugly");
    
    int contador = 0;
		
		 System.out.print("Introduzca una palabra en español: ");
		 String palabraIntro = s.nextLine();
		 
		 if (m.containsKey(palabraIntro)){
			 m.get(palabraIntro);
			 for (Map.Entry pareja: m.entrySet()) {
				 	if ((pareja.getValue()).equals(m.get(palabraIntro))){
            if (!(pareja.getKey()).equals(palabraIntro)){
				 					 		 
              System.out.print(pareja.getKey() + "\t");	
              contador++;
            }
					}
          
			 }
      }
     	
     if ((m.containsKey(palabraIntro)) && (contador == 0)){
       System.out.println("El diccionario no contiene ningun sinónimo de " + palabraIntro);
       System.out.println("Por favor agrege un sinónimo de la palabra elegida: ");
			 String sinonimo = s.nextLine(); 
       m.get(palabraIntro);
       m.put(sinonimo, m.get(palabraIntro));	
			  for (Map.Entry pareja: m.entrySet()) {
			     			 		 
              System.out.println(pareja);	
        }
			 
      }
	} 
}	

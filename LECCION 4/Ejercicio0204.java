/**
* Sentencia múltiple (switch)
* Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21
a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir
por teclado.

* @author Elena Téllez
*/
public class Ejercicio0204 {
	public static void main(String[] args) {
	
		System.out.print("Por favor, introduzca una hora del dia: ");
		int hora = Integer.parseInt(System.console().readLine());
		
		String saludo = "";		

		if ((hora <= 5) && (hora >= 21)){
		saludo = "Buenas Noches";
		System.out.println(saludo + " son las " + hora + " horas. ");
		}
				
		if ((hora >= 13) && (hora <= 20)){
		saludo = "Buenas Tardes";
		System.out.println(saludo + " son las " + hora + " horas. ");
		}
		
		if ((hora >= 6) && (hora <= 12)){
		saludo = "Buenas Días";
		System.out.println(saludo + " son las " + hora + "  horas. ");
		}
			
	}	
}

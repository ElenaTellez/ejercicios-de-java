/**
 * Ejercicio 11 Leccion 4
 *
 * Escribe un programa que dada una hora determinada (horas y minutos), calcule los
 * segundos que faltan para llegar a la medianoche.
 *
 * @author Elena Téllez
 */
public class Ejercicio1104 {

	public static void main(String[] args) {

	System.out.println("Vamos a calcular los segundos que faltan para llegar a medianoche."); 
  System.out.println("Por favor, introduzca la hora que es sin minutos: ");    
	int hora = Integer.parseInt(System.console().readLine());	
	
	System.out.println("Por favor, introduzca los minutos: ");
	int minuto = Integer.parseInt(System.console().readLine());
	
	int segundosHora = ((hora * 87600)/24);
	int segundosMinuto = ((minuto * 3600)/60);
	int respuesta = (87600 - (segundosHora + segundosMinuto));
	
		if ((hora >= 0) && (hora < 24) && (minuto >= 0) && (minuto < 60)) {
			System.out.println("Faltan " + respuesta + " segundos para llegar a medianoche");
			} else {
				System.out.println("Los datos introducidos no son correctos");
			}
	}
}	

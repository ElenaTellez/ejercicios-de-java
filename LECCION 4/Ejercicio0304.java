/**
* Ejercicio 3
* Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre
* del día de la semana.

* @author Elena Téllez
*/
public class Ejercicio0304 {
	public static void main(String[] args) {
	
		System.out.print("Por favor, introduzca un numero de dia de la semana del 1 al 7: ");
		int dia = Integer.parseInt(System.console().readLine());
		
		String diaSemana = "";
		
		switch (dia) {
		
		case 1:
			diaSemana = "lunes";
			break;
		
		case 2:
			diaSemana = "martes";
			break;
		
		case 3:
			diaSemana = "miercoles";
			break;
		
		case 4:
			diaSemana = "jueves";
			break;
		
		case 5:
			diaSemana = "viernes";
			break;
			
		case 6:
			diaSemana = "sabado";
			break;
		
		case 7:
			diaSemana = "domingo";
			break;

		}

		System.out.println("Ese día es " + diaSemana);
		}
	}

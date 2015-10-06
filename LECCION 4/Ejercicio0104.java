
/**
* Sentencia múltiple (switch)
* Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura
toca a primera hora ese día.
* @author Elena Téllez
*/
public class Ejercicio0104 {
	public static void main(String[] args) {
	
		System.out.print("Por favor, introduzca un día de la semana: ");
		String dia = System.console().readLine();
		
		String asignatura ="";		

		switch (dia) {
	
		case "lunes": 
		asignatura = "FOL";
		break;
		
		case "martes":
		asignatura = "Programacion";
		break;
		
		case "miercoles":
		asignatura = "Sistemas Informaticos";
		break;
		
		case "jueves":
		asignatura = "Programación";
		break;
		
		case "viernes":
		asignatura = "Base de Datos";
		break;
		}

		System.out.println("A primera hora el " + dia + " tenemos: " + asignatura);
		
	}	
}

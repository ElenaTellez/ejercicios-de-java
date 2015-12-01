/**
 * Escribe un programa que genere el menú del día de un restaurante vegetariano. El programa debe pedir el día
de la semana, que será un número del uno al siete, y a continuación debe mostrar de forma aleatoria la
secuencia de platos en función de las siguientes condiciones: (a) De primer plato puede haber ensalada, pasta
o arroz (b) De segundo plato puede haber hamburguesas de soja, filetes de seitán o albóndigas de tofu que irán
acompañados con una guarnición que puede ser patatas bravas, verduras a la plancha o pimientos asados (c)
De postre puede haber flan, helado o arroz con leche (d) Cuando el primer plato es arroz, el postre no puede ser
arroz con leche (e) Los sábados y domingos no hay menú (se debe mostrar un mensaje que así lo indique).
Ejemplo:
Selecciona un día de la semana (un número del 1 al 7): 5
Menú del día: pasta de primero, albóndigas de soja con patatas bravas de segundo y arroz con leche de postre.
 *
 * @author Elena Téllez
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    System.out.println("Este programa genera, aleatoriamente, el menú de un restaurante vegetariano.");
    System.out.println("Por favor indique el día de la semana (del 1 al 7): ");
    int diaSemana = Integer.parseInt(System.console().readLine());
    String dia = " ";
    int i = 30;
    
    switch (diaSemana) {
      case 1:
      dia = "Lunes";
      break;
      case 2:
      dia = "Martes";
      break;
      case 3:
      dia = "Miercoles";
      break;
      case 4:
      dia = "Jueves";
      break;
      case 5:
      dia = "Viernes";
      break;
      case 6:
      dia = "Sábado";
      break;
      case 7:
      dia = "Domingo";
      break;
      default:
      dia = "Día incorrecto";
      break;
    }
    
    if ((diaSemana == 6) || (diaSemana == 7)) {
      System.out.println("El  " + dia  + " no hay menú.");
    } else {
      int primerPlato = (int)(Math.random() * 3);
      int segundoPlato = (int)(Math.random() * 3);
      int postre = (int)(Math.random() * 3);
	  int guarnicion = (int)(Math.random() * 3);
	  int albondigas = (int)(Math.random() * 3);
	  
	  
      String primero = " ";
      String segundo = " ";
      String fin = " ";
      String tipo = " ";
      String albon = " ";
      
      switch (primerPlato) {
        case 0:
        primero = "ensalada";
        break;
        case 1:
        primero = "pasta";
        break;
        case 2:
        primero = "arroz";
        break;
        default:
        break;
      }
      switch (segundoPlato) {
        case 0:
        segundo = "Hamburguesas de soja";
        break;
        case 1:
        segundo = "Filetes de seitán";
        break;
        case 2:
        segundo = "Albóndigas de tofú";
        break;
        default:
        break;
      }
      
      switch (guarnicion) {
			  case 0:
				tipo  = "Patatas Bravas";
			  break;
			  case 1:
			  tipo  = "Verduras a la plancha";
			  break;
			  case 2:
			  tipo  = "Pimientos asados";
			  break;
			  default:
			  break;
			}
      
      switch (postre) {
        case 0:
        fin = "Flan";
        break;
        case 1:
        fin = "Helado";
        break;
        case 2:
        fin = "Arroz con Leche";
        break;
        default:
        break;
      }
      
      
      if (fin.equals("Arroz con Leche"))  {
        int x = 1;
        while (x > 0) {
          postre = (int)(Math.random() * 3);
            if (postre == primerPlato) {
              x = 2;
            }
          x--;
        }
        switch (postre) {
			case 0:
			fin = "Flan";
			break;
			case 1:
			fin = "Helado";
			break;
			case 2:
			fin = "Arroz con Leche";
			break;
			default:
			break;
		}
	}
        
    System.out.print("El menu del " + dia + " es: " + primero + " con " + segundo + " acompañados de " + tipo + " y " + fin);
     
    }
  }
}

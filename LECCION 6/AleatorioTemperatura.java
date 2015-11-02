/**
* Escribe un programa que genere el menú del día de un restaurante vegetariano. El programa debe pedir el día
* de la semana, que será un número del uno al siete, y a continuación debe mostrar de forma aleatoria la
* secuencia de platos en función de las siguientes condiciones:
* (a) De primer plato puede haber ensalada, pasta o arroz
* (b) De segundo plato puede haber hamburguesas de soja, filetes de seitán o albóndigas de tofu 
* que irán  acompañados con una guarnición que puede ser patatas bravas, 
* verduras a la plancha o pimientos asados 
* (c) De postre puede haber flan, helado o arroz con leche 
* (d) Cuando el primer plato es arroz, el postre no puede ser arroz con leche 
* (e) Los sábados y domingos no hay menú (se debe mostrar un mensaje que así lo indique).
* Ejemplo:
* Selecciona un día de la semana (un número del 1 al 7): 5
* Menú del día: pasta de primero, albóndigas de soja con patatas bravas de segundo y arroz con leche de postre.
*
* @author Elena Téllez
*/

public class Examen20142015preg1 {
  public static void main(String[] args) {

    System.out.println("Por favor, elija un día de la semana (1 al 7):");
		int dia= Integer.parseInt(System.console().readLine());
    
    
    String menu = "";
    
	
       
			    
      switch ((Math.random()*7)){ //genera el carácter de relleno
          
          
          case 1:
            dia = "pasta";
            break;  
          
          case 2:
            dia = "arroz";
            break;
          
          case 3:
            dia = "ensalada";
            break;
          
                    
            default:
        
        }          
			
    
      
			System.out.println(); //es necesario para dar orden a los bucles. 
			
			
  }
}

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

public class Ex201415Preg1 {
  public static void main(String[] args) {

    System.out.println("Por favor, elija un día de la semana (1 al 7):");
		int dia= Integer.parseInt(System.console().readLine());
    
    String primerPlato = "";
    String segundoPlato = "";
    String postre = "";
    String arroz = "";
    
    if (dia > 5) {
			System.out.println("Los sábados y domingos no servimos menú.");	
		}	
        
		if (dia <= 5) {	    
		
			switch ((int)(Math.random()*3)){           
						
				case 1:
				primerPlato = "ensalada";
				break;  
						
				case 2:
				primerPlato = "pasta";
				break;
						
				case 3:
				primerPlato = "arroz";
				break;								
											
				default:
					
				}
			 
				switch ((int)(Math.random()*3)){  				
												
					case 1:
					segundoPlato = "hamburguesas de soja";
					break;  
						
					case 2:
					segundoPlato = "filetes de seitán";
					break;
						
					case 3:
					segundoPlato = "albóndigas de tofu que irán acompañados con una guarnición que puede ser patatas bravas ";
					break;         
											
					default:
					
				}      				
				 
				if (primerPlato != arroz) {
				
					switch ((int)(Math.random()*3)){  				
													
						case 1:
						postre = "flan";
						break;  
							
						case 2:
						postre = "helado";
						break;
							
						case 3:
						postre = "arroz con leche ";
						break;         
												
						default:						
					}   	
				} else {  
						
					switch ((int)(Math.random()*2)){  				
														
						case 1:
						postre = "flan";
						break;  
								
						case 2:
						postre = "helado";
						break;
							
						default:
					} 					
				}
				
				System.out.println("Como primer plato del menú de hoy tenemos: " + primerPlato);
				System.out.println("Como segundo plato del menú de hoy tenemos: " + segundoPlato); 
				System.out.println("Como postre del menú de hoy tenemos: " + postre);		
					
		}		
  }
}

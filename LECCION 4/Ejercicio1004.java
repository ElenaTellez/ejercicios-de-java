/**
 * Ejercicio 10 Leccion 4
 *
 * Escribe un programa que nos diga el horóscopo a partir del día y el mes de nacimiento.
 *
 * @author Elena Téllez
 */
public class Ejercicio1004 {

	public static void main(String[] args) {

    System.out.println("Por favor, introduzca el mes en el que nació\nEnero=1\nFebrero=2\n Marzo=3\nAbril=4\nMayo=5\nJunio=6\nJulio=7\nAgosto=8\nSeptiembre=9\nOctubre=10\nNoviembre=11\nDiciembre=12\n");    
	String mes = System.console().readLine();
	int n = Integer.parseInt( mes);
	System.out.println("Por favor, introduzca el dia del mes en el que nació\n");
	int dia = Integer.parseInt(System.console().readLine());
	
	switch (n) {
	
		case 1:  
			if (dia <= 21) {
			System.out.println("Su Horoscopo es Capricornio.");
			} else {
				System.out.println("Su Horoscopo es Acuario.");
			}	
			break;
		
		case 2:  
			if  (dia <= 21) {
			System.out.println("Su Horoscopo es Acuario.");
			} else {
				System.out.println("Su Horoscopo es Piscis.");
			}	
			break;
		
		case 3:
			if (dia <= 21) {
			System.out.println("Su Horoscopo es Piscis.");
			} else {
				System.out.println("Su Horoscopo es Aries.");
			}	
			break;
		
		case 4:		
			if (dia <= 20) {
			System.out.println("Su Horoscopo es Aries.");
			} else {
				System.out.println("Su Horoscopo es Tauro.");
			}	
			break;
		
		case 5:		
			if (dia <= 21) {
			System.out.println("Su Horoscopo es Tauro.");
			} else {
				System.out.println("Su Horoscopo es Geminis.");
			}	
			break;
		
		case 6:
		
			if (dia <= 21) {
			System.out.println("Su Horoscopo es Geminis.");
			} else {
				System.out.println("Su Horoscopo es Cáncer.");
			}	
			break;
		
		case 7:		
			if  (dia <= 22) {
			System.out.println("Su Horoscopo es Cáncer.");
			} else {
				System.out.println("Su Horoscopo es Leo.");
			}	
			break;
		
		case 8:
			if (dia <= 22) {
			System.out.println("Su Horoscopo es Leo.");
			} else {
				System.out.println("Su Horoscopo es Virgo.");
			}	
			break;
			
		case 9:		
			if  (dia <= 23) {
			System.out.println("Su Horoscopo es Virgo.");
			} else {
				System.out.println("Su Horoscopo es Libra.");
			}	
			break;
			
		case 10:		
			if (dia <= 22)  {
			System.out.println("Su Horoscopo es Libra.");
			} else {
				System.out.println("Su Horoscopo es Escorpión.");
			}	
			break;
			
		case 11:
		
			if  (dia <= 21)  {
			System.out.println("Su Horoscopo es Escorpión.");
			} else {
				System.out.println("Su Horoscopo es Sagitario.");
			}	
			break;
		
		case 12:		
			if (dia <= 21) {
			System.out.println("Su Horoscopo es Sagitario.");
			} else {
				System.out.println("Su Horoscopo es Capricornio.");
			}		
			break;
		}				
				
	}
}

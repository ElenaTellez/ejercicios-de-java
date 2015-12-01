/**
 * Ejercicio PlanoInclinado
 * 
 * Realiza un programa que pinte por pantalla un plano inclinado construido con ladrillos (carácter #) y que tiene la
 * caída de izquierda a derecha. Sobre este plano inclinado rueda una bolita (la letra O). El dibujo será como una
 * fotografía de la bolita rodando. La bolita se colocará de forma aleatoria sobre una de las posibles posiciones que
 * puede ocupar en el plano inclinado desde lo alto hasta tocar el suelo. La altura del plano inclinado será indicada
 * por el usuario y deberá ser mayor o igual a 3.
 * 
 * @author Elena Téllez
 */

public class PlanoInclinado {

  public static void main(String[] args) {
    
    System.out.println("Vamos a dibujar una pirámide.\n ");
    System.out.println("Por favor, introduzca la altura que desee que tenga la pirámide.\n ");
    int altura = Integer.parseInt(System.console().readLine());
    
    
    int i = 0;    
    int tamaño = 0; //pisos de la piramide
    int pelota = ((int)((Math.random()*altura))+1);  
		   
		while (tamaño <= altura) {   //el numero de filas, las veces que entro en el bucle, ser igual a la altura elegida
      for (i = 0; i < tamaño ; i++) { //aumento el numero de caractares cada vez entro en el bucle
			System.out.print("#"); // inserta relleno
			}
			
     if (pelota == tamaño){
          
		System.out.print("O"); 
    
    }  // inserta pelota		
		System.out.println(); //es necesario para dar orden a los bucles. 			
		tamaño++; //contador, veces que entro en el bucle. 
		}
	
  }
} 

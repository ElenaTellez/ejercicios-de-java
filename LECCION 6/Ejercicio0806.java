/**
* Ejercicio 8 Leccion 6
*
* Modifica el programa anterior para que la probabilidad de que salga un 1 sea de 1/2, la
* probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2
* = 3/6 y 1/3 = 2/6.
* 
* @author Elena Téllez
*/

public class Ejercicio0806 {
  public static void main(String[] args) {
		
    int resultadoPartido;
    int columnas = 3;
    
    for (int fila = 1; fila <= 15; fila++) {
      System.out.printf("%4d. |", fila);
      
      if (fila == 15) { // Esta expresion es para el pleno al 15
        columnas = 1;
      }
      
     for (int apuesta = 1; apuesta <= columnas; apuesta++) {
        resultadoPartido = (int)(Math.random() * 6) + 1; //3/6 + 2/6 + 1/6 = 6/6, por lo que reduzco la posibilidad a 6 y asigno el porcentaje
        switch(resultadoPartido) {
          case 1:
          case 2:
          case 3:
            System.out.print("1  |");
            break;
          case 4:
          case 5:
            System.out.print(" X |");
            break;
          case 6:
            System.out.print("  2|");
          default:
        }
      }
      System.out.println();
    }
  }
}

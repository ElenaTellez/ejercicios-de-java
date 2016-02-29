/**
 * 
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
 * se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe
 * rotar los números hacia la derecha hasta que el mínimo se coloque en la posición 0. El elemento que
 * sale por la derecha deberá entrar por la izquierda tantas veces como sea necesario. Al final se debe
 * mostrar el array resultante.
 * 
 * @author Elena Tellez
 */
public class ExamenArrays {

  public static void main(String[] args) {
    
    int numeros[];
    numeros = new int[10]; 
    int aux[];
    aux = new int[10];
    int menor=99999;
    int valor=999;
    int aux2[]; //Para guardar el array inicial
    aux2 = new int[10];
    

    for (int i = 0; i<10; i++){ 
          System.out.print("Introduce un número: ");
          numeros[i] = Integer.parseInt(System.console().readLine());
    }
         
    for (int i = 0; i < 10; i++){ //Copiar en un array auxiliar
          aux[i] = numeros[i];
          aux2[i] = numeros[i];
    }
           
    for (int i = 0; i < 10; i++){
             
          if (numeros[i] < valor){ //Compruebo si es el menor
              menor = i; //La posición en el array del menor
              valor = numeros[i]; //El numero menor
          }
        
    }
      
    if (menor!=0){ //Si es 0 no hay que dar ninguna vuelta porque ya está en su sitio
           
        for (int o = 10 - menor; o > 0; o--){ //Se calcula el número de posiciones que hay que saltar
              //System.out.println("vuelta");
              numeros[1] = aux[0];
              numeros[0] = aux[9];
              
              for (int i = 1; i<9; i++){
               numeros[i+1] = aux[i];
              }
              for (int i = 0; i<10; i++){ //Actualizo el auxiliar
                    aux[i] = numeros[i];
              }
              
            }
         
        }
    //System.out.println(menor);
    System.out.println("\n\nArray original:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", aux2[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
     System.out.println("\n\nArray cambiado:");
    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");    
    System.out.print("│ Valor  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%4d ", numeros[i]);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    
        
    
         
    
  }
  
}





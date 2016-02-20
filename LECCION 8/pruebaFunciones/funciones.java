package matematicas;



/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: Crea una biblioteca de funciones matemÃ¡ticas que contenga las siguientes
* funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
*
* @author Elena Tellez
*/

 

public class funciones {

/**
* 
* 1.esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
* y falso en caso contrario.
*
* @param  número entero 
* @return <code>true</code> si el número es capicua
* @return <code>false</code> en caso contrario
*/
	
public static boolean capicua(int numero) {
	if (volteado(numero) == numero) {
	      return true;
	 } 
	     
	return false;
	
}

/**
* 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro
* es primo y falso en caso contrario. Un numero es primo cuando unicamente 
* es divisible entre el mismo y la unidad.
*
* @param x un numero entero positivo
* @return <code>true</code> si el nÃºmero es primo
* @return <code>false</code> en caso contrario
*/

public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
			return false;
			}
		}
	return true;
}

/**
/* 3.Devuelve el menor primo que es mayor al número que se pasa como parámetro.
 *
 * @param x un número entero
 * @return  el menor primo que es mayor al número que se pasa como parámetro
 */
public static int siguientePrimo(int x) {
  while (!esPrimo(++x)) {};

  return x;
}

/**
* 4.potencia: Dada una base y un exponente devuelve la potencia.
*
* @param base un nÃºmero entero 
* @param exponente un nÃºmero entero
* @return la potencia de un numero
*/
public static double potencia(double base, double exponente) {
    
   
    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    return potencia;
  }

/**
* 
* posicionDeDigito: Da la posicion de la primera ocurrencia de un digito
* dentro de un numero entero. Si no se encuentra, devuelve -1.
*
* @param un numero entero 
* @param una digito dada
* @return primera ocurrencia de ese digito en numero
* @return -1 si no existe ocurrencia
*/

public static int posicionDeDigito(long numero,int digito){
	
long volteado = 0;
int longitud = 0;    
long ocurrencia = 0;
int i;
		 
 
		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);
			numero /= 10;
			longitud++;
		      	      
			} 
		   
		for (i = 0; i <= longitud; i++) {
			ocurrencia = volteado%10;
			if (ocurrencia == digito){
			return i;
			} else if ((ocurrencia != digito) && (i==longitud))  {
				return -1;
			}
			volteado /=10;
		} 
		return 1;
	}
	
/**
* quitaPorDetras: Le quita a un nÃºmero n dÃ­gitos por detrÃ¡s (por la derecha)
* 
* @param un numero entero
* @param numero de digitos a quitar por detras 
* @return devuelve numero con n digitos menos por detras
*/
public static int quitaPorDetras(int numero, int digitos) {
	
		for (int i = 0; i < digitos; i++){
		
		 
			numero /=10;
			
		}
	
		return numero;
		 
		
	}

/**
* 11.pegaPorDetras: AÃ±ade un dÃ­gito a un nÃºmero por detrÃ¡s.
* 
* @param un numero entero
* @param digito a aÃ±adir por detras 
* @return devuelve numero con digito a aÃ±adido por detras
*/
public static String pegaPorDetras(String numero, String digito) {
	
		 
	
		return numero + digito;
		 
		
	}
/**
* 
* digitoN: Devuelve el digito que esta en la posicion n de un nÃºmero entero. Se
* empieza contando por el 0 y de izquierda a derecha
*
* @param un numero
* @param un una posicion 
* @return el digito de la posicion indicada
*/
public static int digitoN(int numero, int posicion) {
    
   
   // le da la vueta al nÃºmero y calcula la longitud
    int volteado = 0;
    int longitud = 0;    
    int aux = 0;
      
    
    
    while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
        longitud++;
       aux = longitud;
      
      
    } // while

    int digitos [] = new int[aux]; 
    
    for (int i = 0; i < aux; i++) {
    	digitos[i] = volteado%10;
    	volteado /= 10;
    }
    
   	return digitos[posicion];  
   	
   	
	}
/**
* voltea: Le da la vuelta a un número.
*
* @param un número entero 
* @return ese numero volteado
*/
public static int volteado(int numero) {
    
   
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    return volteado;
  }
}
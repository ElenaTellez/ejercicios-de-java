
package examenesarraylist;
import java.util.ArrayList;
import java.util.Collections;

public class fichasDomino {

    public static void main(String[] args) {
       
        ArrayList<Domino>fichas=new ArrayList<>();
        int numFichas=0;
        Domino fichita=new Domino();
        boolean verdadero=true;
        String cartaAleatoria="";
        int ultimaPosicion=-1;
     
                do{
                   //genera la ficha
                   fichita=new Domino();
                   //la primera la mete directamente
                   if(ultimaPosicion==-1){
                       fichas.add(fichita);
                       ultimaPosicion++;
                       
                       //si no es la primera compara si son los dos valores iguales entra
                   }else{
                       if((fichita.getMitad1()).equals(fichas.get(ultimaPosicion).getMitad2())){
                           
                           //si es solo igual el perfil entra
                           verdadero=fichas.contains(fichita);
                            if(verdadero==false){
                                fichas.add(fichita);
                                cartaAleatoria=fichita.getMitad2();//saca el numero de la ficha
                                numFichas++;
                                 ultimaPosicion++;
                      

                            }
                           //si solo es igua el valor entra
                           
                       }
                   } 
               }while(fichas.size()<20);
               System.out.print(fichas); 
    }
}

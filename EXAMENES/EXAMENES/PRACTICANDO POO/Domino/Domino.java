
package examenesarraylist;

public class Domino {
   private String cara1[]={" ","1","2","3","4","5","6"}; 
   private String cara2[]={" ","1","2","3","4","5","6"}; 
   private String mitad1="";
   private String mitad2="";
   private String resultado="";
   public Domino(){
       this.mitad1=cara1[(int)(Math.random()*7)];
       this.mitad2=cara2[(int)(Math.random()*7)];
   }
   public String getMitad1(){
       return this.mitad1;
   }
    public String getMitad2(){
       return this.mitad2;
   }
    public void setMitad1(String mitad1){
       this.mitad1=mitad1;
   }
    public void setMitad2(String mitad2){
       this.mitad2=mitad2;
   }
   @Override
public boolean equals(Object x){
	 boolean iguales=false;
	 Domino obj=(Domino) x;
	if(((this.mitad1).equals(obj.mitad1))&& ((this.mitad2).equals(obj.mitad2))||((this.mitad1).equals(obj.mitad2))&& ((this.mitad2).equals(obj.mitad1))){
		iguales=true;
	}
	return iguales;
}
    public String toString(){
        resultado+="["+mitad1+"|";
        resultado+=mitad2+"]";
        return resultado;
    }
}

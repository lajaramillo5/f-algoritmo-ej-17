/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;

/**
 *
 * @author lenovo
 */
public class Profesor extends Persona{
    private double sueldo;
    public Profesor (double s){
        super ("rene","elizalde",34);
        setSueldo(s);
                
    }
    public Profesor (String n, String ap, int ed, double s){
        super(n,ap,ed);
        setSueldo(s);
    }
        public  Profesor (){
            super ("rene","elizalde",34);
           
  
    }
    public void setSueldo(double s){
        sueldo=s;
    }
    public double getSueldo(){
        return sueldo;
    }
         public void setEdad(int e){
         if (e<30) {
             edad=30;
             
         }else
             edad=e;
         
     }
    
}

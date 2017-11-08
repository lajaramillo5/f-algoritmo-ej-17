/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias;
import ejemplouml.Asignatura_Presencial;



/**
 *
 * @author lenovo
 */
public class Estudiante extends Persona{
    private  double costo=0;
    private   Asignatura_Presencial asignaturas[];
    
    public Estudiante(String n, String a, int e, Asignatura_Presencial asignaturas[]){
        super(n, a, e);
        setArreglo(asignaturas);
        setCosto_matricula();
        
    }
     public void   setArreglo(Asignatura_Presencial n []){
        asignaturas= n;
    }
    
    public Asignatura_Presencial[] getArreglo(){
        return asignaturas;
    }
    
    

    
    @Override
     public void setEdad(int e){
         if (e<18) {
             edad=18;
             
         }else
             edad=e;
         
     }
     public void setCosto_matricula(){
        for (Asignatura_Presencial asignatura : asignaturas) {
            costo += asignatura.getCosto();
        }
         
     }
    public double getCosto(){
        return costo;
    }
    
    @Override
    public String toString(){
        String cadena="";
       for (int i = 0; i < asignaturas.length; i++) {
           cadena+=asignaturas[i].toString()+"\n";
           
       }
    
        return String.format("%s- costo matricula: %f\n listado de asignaturas\n%s", super.toString(), getCosto(),cadena);
        
    }
    
    
    // @Override
    // public String toString(){
    
    //    return String.format("%s - %f", getApellido(), getMatricula());
    // }
}

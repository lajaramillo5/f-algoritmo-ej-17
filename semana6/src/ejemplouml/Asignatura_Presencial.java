/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplouml;

/**
 *
 * @author lenovo
 */
public class Asignatura_Presencial extends Asignatura {
    private int numero_hora;
        public Asignatura_Presencial(String n, String a, double e, int mat){
        super(n, a, e);
        setHoras(mat);
    }
    
    public void setHoras(int mat){
        numero_hora = mat;
    }
    
    public int getHoras(){
        return numero_hora;
    }
         @Override
    public String toString(){
    
        return String.format("%s - numero de horas:%d", super.toString(), getHoras());
    }
    
    
}

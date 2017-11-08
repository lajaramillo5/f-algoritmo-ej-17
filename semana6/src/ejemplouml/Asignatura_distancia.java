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
public class Asignatura_distancia extends Asignatura {
    private int numero_creditos;
        public Asignatura_distancia(String n, String a, double e, int mat){
        super(n, a, e);
        setCreditos(mat);
    }
    
    public void setCreditos(int mat){
        numero_creditos = mat;
    }
    
    public int getCreditos(){
        return numero_creditos;
    }
      @Override
    public String toString(){
    
        return String.format("%s - numero de creditos:%d", super.toString(), getCreditos());
    }
    
}

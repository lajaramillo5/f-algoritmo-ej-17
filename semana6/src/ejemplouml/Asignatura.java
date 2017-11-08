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
public class Asignatura {
    private String nombre;
    private String tipo;
    private double costo;
    
    
     public Asignatura(String n, String a,  double e){
        setNombre(n);
        setTipo(a);
        setCosto(e);
    }
     public void setNombre(String n){
        nombre = n;
    }
    
    public void setTipo(String n){
        tipo = n;
    }
    
    public void setCosto(double n){
        costo = n;
    }
    
    public double getCosto(){
        return costo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s - tipo: %s - costo: %f", 
                getNombre(), getTipo(), getCosto());
    }

    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author lenovo
 */
public class Asignatura {

    private String nombre;
    private int creditos;
    private Carrera carrera;
   
    public Asignatura(Carrera c){
        nombre="Informatica";
        creditos=5;
        carrera=c;
        
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_creditos(int m) {
        creditos = m;
    }

    public int obtener_creditos() {
        return creditos;
    }
        public void establecer_carrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Carrera obtener_carrera() {
        return carrera;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Asignatura\n Nombre: %s\n creditos: %d\n Carrera: %s\n Modalidad:%s\n",
                obtener_nombre(), obtener_creditos(),obtener_carrera().obtener_modalidad(),obtener_carrera().obtener_nombre());
        return cadena;
    }


}

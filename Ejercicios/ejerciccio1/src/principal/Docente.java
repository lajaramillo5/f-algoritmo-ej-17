/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author lenovo
 */
public class Docente {

    private String apellidos;
    private Asignatura asignatura;

    public void agregar_apellidos(String n) {
        apellidos = n;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void agregar_asignatura_1(Asignatura n) {
        asignatura = n;
    }

    public Asignatura obtener_asignatura_1() {
        return asignatura;
    }

    @Override
    public String toString() {
        return String.format("Datos del Docente:\nApellidos:%s\nTine la siguiente asignatura\n Asignatura1: %s", obtener_apellidos(), this.obtener_asignatura_1());
    }

}

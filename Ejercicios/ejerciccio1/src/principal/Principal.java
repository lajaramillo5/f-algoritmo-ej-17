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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Docente uno =new Docente();
        uno.agregar_apellidos("Elizade");
        Asignatura a = new Asignatura();
        a.agregar_asignatura1("matematicas");
        a.agregar_numero_creditos1(5);
        uno.agregar_asignatura_1(a);
        System.out.println(uno);
        // TODO code application logic here
    }
    
}

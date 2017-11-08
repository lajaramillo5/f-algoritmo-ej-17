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
public class Principal {
     public static void main(String[] args) {
         
    Asignatura_Presencial p= new Asignatura_Presencial("Programacion","comun",100,180);
         System.out.println(p);
    Asignatura_distancia p1= new Asignatura_distancia("Literatura","troncal",300,6);
         System.out.println(p1);
}
}
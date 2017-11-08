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
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Asignatura_Presencial asignatura []= new Asignatura_Presencial[2];
        asignatura[0]=new Asignatura_Presencial("Programacion","comun",100,180);
        asignatura[1]=new Asignatura_Presencial("Literatura","troncal",300,6);
        
        Estudiante e = new Estudiante("René", "Elizalde", 16,asignatura );
        System.out.println(e);
         Profesor p = new Profesor (1000);
         System.out.println(p.getNombre());
         Profesor p1 =new Profesor();
         System.out.println(p1.getNombre());
         Profesor p2 = new Profesor("luis","alvarez",20,3000);
         p2.getNombre();
        
         
    }
    
}

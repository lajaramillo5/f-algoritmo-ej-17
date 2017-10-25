/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana_4;

/**
 *
 * @author lenovo
 */
public class Carrera {

        // TODO code application logic here
        private String nombre;
        private String modalidad;
        public void establecer_nombre(String n){
        nombre=n;
        }
        public String obtener_nombre(){
            return nombre;
        }
               public void establecer_modalidad(String m){
        modalidad=m;
        }
        public String obtener_modalidad(){
            return modalidad;
        }
        public Carrera(){
            modalidad="distancia";
        }
        public Carrera(String md){
            modalidad=md;
        }
        public Carrera(String md,String x){
           modalidad=md;
           nombre=x;
        }
        
        
        
    }
    


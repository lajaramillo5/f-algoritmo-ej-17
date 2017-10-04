/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        // TODO code application logic here
        int numero=0;
        int solucion;
        System.out.println("ingresar numero a calcular :\n");
        numero=e.nextInt();
        for(int i=1;i<=12;i++){
            solucion=numero*i;
            System.out.printf("%d x %d = %d\n ",numero,i,solucion);
        }
        
            
        
    }
    
}

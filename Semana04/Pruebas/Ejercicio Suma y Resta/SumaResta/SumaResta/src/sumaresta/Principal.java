/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaresta;

import java.util.Scanner;

/**
 *
 * @author TITO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a, b, opcion;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese campo A: ");
        a = sc.nextInt();
        System.out.print("Ingrese campo B: ");
        b = sc.nextInt();
        System.out.print("Ingrese opcion Suma[1], Resta[2]: ");
        opcion = sc.nextInt();
        
        SumaResta x = new SumaResta(a, b, opcion);
        System.out.println(x.obtenerResultado());
        
    }
    
}

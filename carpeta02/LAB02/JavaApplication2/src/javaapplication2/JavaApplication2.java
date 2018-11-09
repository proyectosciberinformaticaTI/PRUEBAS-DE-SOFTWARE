/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author SUITE
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        /*Date obj=new Date();
        long time = obj.getTime();        
        SimpleDateFormat dffd=new SimpleDateFormat("HH:mm");
        System.out.println(dffd.format(time));*/
        Scanner cs=new Scanner(System.in);
        System.out.println("ingrese hora de entrada");
        String horario=cs.nextLine();
        Metodos obje=new Metodos(horario);
        System.out.println(obje.calcularmontopagar());
        
        
        
        
        
        
    }
    
    
    
    
    
}

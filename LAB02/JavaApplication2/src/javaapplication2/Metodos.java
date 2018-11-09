/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author SUITE
 */
public class Metodos {
    
    
    private double monto=50;
    private String tiempo1;
    private String tiempox1="22:00";
    private String tiempox2="23:00";
    private String tiempox3="00:00";    
    private String timepoextra="05:00";
    private String tiempoextra2="23:59";
    
    private String expresionregular="^[0-2][0-4]{2}:[0-9]{2}$";
    
    public Metodos(String tiempo1){
        this.tiempo1=tiempo1;
    }
    
    
    
    
    public boolean  validarfechita(String patronsd){
        Pattern pat=Pattern.compile(expresionregular);
          //pat.matcher(tiempo1)
          Matcher mat=pat.matcher(patronsd);
          if(mat.matches()){
              return true;
          }
        return false;
    }
    
    
    
    
    
    
    public String calcularmontopagar() throws ParseException{
        String resultado="";
        Date obj=new Date();
        //long time = obj.getTime();         
        SimpleDateFormat dffd=new SimpleDateFormat("HH:mm");        
        Date time1=dffd.parse(tiempo1);
        Date tiemp2=dffd.parse(tiempox1);//22:00
        Date tiem3=dffd.parse(tiempox2);//23:00
        Date tiem4=dffd.parse(tiempox3);//00:00
        Date tiem5=dffd.parse(timepoextra);
        Date tiem6=dffd.parse(tiempoextra2);
        
       
        
        if(time1.before(tiemp2) && time1.after(tiem5) ){
            resultado="paga el 70% del monto de 50 soles";
        }
        else if(time1.before(tiem3) && time1.after(tiemp2) ){
            resultado="paga el 90% del monto de 50 soles";
        }
        else if(time1.after(tiem4) && time1.before(tiem5) ){
            resultado="para el 100% del monto de 50 soles";
        }
        else if(time1.after(tiem3) && time1.before(tiem6) ){
            resultado="en este horario no hay descuento";
        }      
        else{
            resultado="no es una hora valida";
        }
        return resultado;
    }
    
    
    
    
    
    
    
    
    
    
    
}

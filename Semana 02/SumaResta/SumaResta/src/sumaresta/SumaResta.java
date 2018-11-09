/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaresta;

/**
 *
 * @author Jorge Aguilar
 */
public class SumaResta {
    
    private int a;
    private int b;
    private int opcion;

    public SumaResta(int a, int b, int opcion) {
        this.a = a;
        this.b = b;
        this.opcion = opcion;
    }
 
    public boolean validarA(){
        
        if(a >= 400 && a <= 999)
            return true;
        else
            return false;
        
    }
    
    public boolean validarB(){
        
        if(b >= 10 && b <= 99)
            return true;
        else
            return false;
        
    }
        
    public String obtenerResultado(){
        
        String mensaje = "";
        
        if(validarA() == false)
            mensaje = "Campo A errado";
        else
            if(validarB() == false)
                mensaje = "Campo B errado";
            else{
                switch(opcion){
                    case 1: mensaje = "La suma es: "+(a+b); break;
                    case 2: mensaje = "La resta es: "+(a-b); break;
                    default: mensaje = "Opción errada"; break;
                }
            }
        
        return mensaje;
        
    }
    
}

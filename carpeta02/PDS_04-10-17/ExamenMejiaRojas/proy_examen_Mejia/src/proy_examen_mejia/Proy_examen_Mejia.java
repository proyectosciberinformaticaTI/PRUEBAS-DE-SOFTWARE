
package proy_examen_mejia;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import pe.cibertec.util.Fechas;

/**
 *
 * @author SUITE
 */
public class Proy_examen_Mejia {

 
    public static void main(String[] args) {
       
        
        //DEclaramos los literales a usar
        
        
        
        String literalCodigo = "[P][R][0-9][0-9][0-9][0-9]";
        
        String literalNombre = "[a-zA-Z]{4,}";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Codigo equipo: ");
        
        String campo1 = scanner.nextLine();
        
        System.out.print("Nombre del equipo: ");
        
        String campo2 = scanner.nextLine();
        
        System.out.print("Fecha del siguiente mantenimiento: ");
        
        String campo3 = scanner.nextLine();
        
        if(!campo1.matches(literalCodigo)){
            System.out.println("Ingrese un código válido");
            return;
        }
        
        if(!campo2.matches(literalNombre)){
            System.out.println("Recuerde que el nombre del equipo debe contener al menos 4 caracteres");
            return;
        }
      
        //Validamos la fecha
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActual = sdf.format(new Date());
        
       // System.out.print(fechaActual);
       /*
       String campo3 = "27/09/2017";
       String campo4 = "26/09/2017";
       String campo5 = "28/09/2017";
       */
        boolean bandera = Fechas.compararFechas(fechaActual, campo3);
        
        //System.out.println(bandera);
        if(!bandera){
            System.out.println("Debe ingresar una fecha valida");
            return;
        }
        
        //Si llegamos hasta aca
        System.out.println("El registro ha sido exitoso");
    }
    
}


package pe.cibertec.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author SUITE
 */
public class Fechas {
    //Me devuelve true si la fecha1 es menor fecha2 
	public static boolean compararFechas(String fecha1, String fecha2){
		
		boolean bandera = false;
		
		try {
			
			SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
			
			Date date1 = sdf.parse(fecha1);
			Date date2 = sdf.parse(fecha2);
			
			if(date1.before(date2)){
				bandera = true;
			}else if(date2.before(date1)){
				bandera = false;
			}else{
				bandera = false;
			}
			
			
		} catch (Exception e) {
			System.out.println("La fecha debe tener este formato (dd/MM/yyyy)");
		
		}
		
		
		return bandera;
	}
}

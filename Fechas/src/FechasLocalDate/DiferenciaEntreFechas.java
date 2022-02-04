/*Con este miniejemplo busco mostrar como podemos sacar una diferencia entre dos fechas facilmente gracias a una simple función*/
package FechasLocalDate;

import java.time.LocalDate; // importamos LocalDate
import java.time.Period; // importamos Period

/**
 *
 * @author Ezequiel
 */
public class DiferenciaEntreFechas {

    public static void main(String[] args) {

        // para usar este metodo primero vamos a requerir 2 objetos de tipo LocalDate
        // Editar estas variables para ver distintos ejemplos
        int year = 2005;
        int month = 06;
        int day = 16;

        LocalDate fechaActual = LocalDate.now(); //'LocalDate.now()' agarra la fecha actual de la pc

        LocalDate fechaUser = LocalDate.of(year, month, day); //LocalDate.of() pide los datos en el siguiente orden: año, mes, día.

        // El metodo Period.between pide dos fechas de la clase LocalDate y compara la cantidad de años, meses, y días que hay entre las fechas
        System.out.println("Periodo de diferencia entre ambas fechas: " + Period.between(fechaActual, fechaUser));
        
        //Dispone de varios metodos para usar, a continuación algunos ejemplos:
        
        System.out.println("Años de diferencia: " + Math.abs(Period.between(fechaActual, fechaUser).getYears())); // Sacar solo los años de diferencia
        System.out.println("Meses de diferencia: " + Math.abs(Period.between(fechaActual, fechaUser).getMonths())); // Sacar solo los meses de diferencia
        System.out.println("Días de diferencia: " + Math.abs(Period.between(fechaActual, fechaUser).getDays())); // Sacar solo los dias de diferencia
        //(Recordar usar el 'Math.abs()' para evitar valores negativos)
    }

}

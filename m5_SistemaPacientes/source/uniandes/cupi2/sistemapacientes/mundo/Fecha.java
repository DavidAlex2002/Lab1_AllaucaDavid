/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$ 
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1 
 *
 * Proyecto Cupi2 (http://cupi2.uniandes.edu.co)
 * Ejercicio: n1_empleado 
 * Autor: Mario Sánchez - 14/06/2005 
 * Autor: Mario Sánchez - 14/06/2005
 * Autor: Pablo Barvo - 22/08/2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ 
 */

package uniandes.cupi2.sistemapacientes.mundo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Esta clase sirve para representar una fecha y hacer algunas operaciones básicas
 */
public class Fecha
{

    // Atributos

    private int dia;

    private int mes;

    private int anio;

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------


//Inicializa una fecha con los parámetros proporcionados <br>

    public void inicializar( int d, int m, int a )
    {
        dia = d;
        mes = m;
        anio = a;
    }

    /**
     * Construye una nueva fecha inicializada en el día de hoy. <br>
     */
    public void inicializarHoy( )
    {
        // Usamos un calendario Gregoriano inicializado en el día de hoy
        GregorianCalendar gc = new GregorianCalendar( );

        // Sacamos los valores de día, mes y año del calendario
        dia = gc.get( Calendar.DAY_OF_MONTH );
        mes = gc.get( Calendar.MONTH ) + 1;
        anio = gc.get( Calendar.YEAR );
    }

    /**
     * Retorna el día de esta fecha
     */
    public int darDia( )
    {
        return dia;
    }

    /**
     * Retorna el mes de esta fecha
     */
    public int darMes( )
    {
        return mes;
    }

    /**
     * Retorna el año de esta fecha
     */
    public int darAnio( )
    {
        return anio;
    }

    /**
     * Este método sirve para dar la diferencia en meses que hay entre dos fechas.
     */
    public int darDiferenciaEnMeses( Fecha fecha )
    {
        int diferencia = 0;

        int otroAnho = fecha.darAnio( );
        int otroMes = fecha.darMes( );
        int otroDia = fecha.darDia( );

        // Calcula la diferencia en meses
        diferencia = 12 * ( otroAnho - anio ) + ( otroMes - mes );

        //Si el día no es mayor, resta un mes
        if( otroDia < dia )
            diferencia--;

        return diferencia;
    }

    /**
     * Retorna una cadena que representa la fecha
     */
    public String toString( )
    {
        return "" + dia + "-" + mes + "-" + anio;
    }
}

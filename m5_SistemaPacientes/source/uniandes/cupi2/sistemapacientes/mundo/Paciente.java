/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: m4_Pacientes
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.sistemapacientes.mundo;


/**
 * Esta clase representa un paciente
 */
public class Paciente
{
    // Atributos

    private String nombre;
    private String apellido;
    private int sexo;
    private Fecha fechaNacimiento;
    private Fecha fechaTomaMuestra;
    private String imagen;
	private double volumenMuestra; 
    private double volumenEritrocitos;
    private int conteoLeucocitos; 
    private int conteoPlaquetas;
    private boolean enAyunas;

    // Métodos

    /**
     * Inicializa un paciente con la información básica. <br>
 
     * 
     */
    public Paciente( String pNombre, String pApellido, int pSexo, Fecha pFechaN, Fecha pFechaTomaMuestra, double pVolumenMuestra, 
    		         double pVolumenEritrocitos, int pConteoLeucocitos, int pConteoPlaquetas, boolean pEnAyunas, String pImagen )
    {
        nombre = pNombre;
        apellido = pApellido;
        sexo = pSexo;
        fechaNacimiento = pFechaN;
        fechaTomaMuestra = pFechaTomaMuestra;
        imagen = pImagen;
        volumenMuestra = pVolumenMuestra;
        volumenEritrocitos = pVolumenEritrocitos;
        conteoLeucocitos = pConteoLeucocitos;
        conteoPlaquetas = pConteoPlaquetas;
        enAyunas = pEnAyunas;
    }

    /**
     * Retorna el apellido del paciente
     * @return apellido
     */
    public String darApellido( )
    {
        return apellido;
    }

    /**
     * Retorna la fecha de la toma de muestra del paciente en una cadena de caracteres
     * @return fechaIngreso
     */
    public String darFechaTomaMuestra( )
    {
        String strFecha = fechaTomaMuestra.toString( );
        return strFecha;
    }

    /**
     * Retorna la fecha de nacimiento del paciente en una cadena de caracteres
     * @return fechaNacimiento
     */
    public String darFechaNacimiento( )
    {
        String strFecha = fechaNacimiento.toString( );
        return strFecha;
    }

    /**
     * Retorna la ruta donde se encuentra la imagen del paciente
     * @return imagen
     */
    public String darImagen( )
    {
        return imagen;
    }

    /**
     * Retorna el nombre del paciente
     * @return nombre
     */
    public String darNombre( )
    {
        return nombre;
    }

    /**
     * Retorna el sexo del paciente.
     * @return sexo. sexo pertenece a {1 , 2 }
     */
    public int darSexo( )
    {
        return sexo;
    }

    /**
     * Retorna la edad del paciente en años.
     * @return Edad del paciente
     */
    public int darEdad( )
    {
        // Obtiene la fecha actual
        Fecha hoy = new Fecha( );
        hoy.inicializarHoy( );

        //Calcula la diferencia de años
        int edad = fechaNacimiento.darDiferenciaEnMeses( hoy ) / 12;

        return edad;
    }


    /**
     * Método que calcula el hematocrito de la muestra del paciente
     * @param pVolumenMuestra Volumen de muestra del paciente
     * @param pVolumenEritrocitos Volumen
     * @return Hematocrito
     */
	public double calcularHematocrito() 
	{
		double calculoHematocrito = (volumenEritrocitos / volumenMuestra) * 100;
		return calculoHematocrito;
	}

	/**
	 * @param pVolumenMuestra Volumen
	 * @param pVolumenEritrocitos Volumen
	 * @param pLeucocitos Leucocitos
	 * @return Leucocitos
	 */
	public double calcularLeucocitos()
	{
		double calculoLeucocitos = (conteoLeucocitos / (volumenMuestra - volumenEritrocitos)) * 100;
		return calculoLeucocitos;
	}
	
	/**
	 * 
	 * @return Volumen
	 */
    public double darVolumenMuestra() 
    {
		return volumenMuestra;
	}

    /**
     * 
     * @return Volumen
     */ 
	public double darVolumenEritrocitos() 
	{
		return volumenEritrocitos;
	}

	/**
	 * 
	 * @return Leucocitos
	 */
	public int darConteoLeucocitos() 
	{
		return conteoLeucocitos;
	}

	/**
	 * 
	 * @return Plaquetas
	 */
	public int darConteoPlaquetas() 
	{
		return conteoPlaquetas;
	}

	/**
	 * 
	 * @return enAyunas
	 */
	public boolean darEnAyunas() 
	{
		return enAyunas;
	}

	/**
	 * 
	 * @param pVolumenMuestra Volumen nuevo
	 */
	public void cambiarVolumenMuestra(double pVolumenMuestra) 
	{
		volumenMuestra = pVolumenMuestra;
	}

	/**
	 * 
	 * @param pVolumenEritrocitos Volumen nuevo
	 */
	public void cambiarVolumenEritrocitos(double pVolumenEritrocitos) 
	{
		volumenEritrocitos = pVolumenEritrocitos;
	}

	/**
	 * 
	 * @param pConteoLeucocitos Leucocitos 
	 */
	public void cambiarConteoLeucocitos(int pConteoLeucocitos) 
	{
		conteoLeucocitos = pConteoLeucocitos;
	}

	/**
	 * 
	 * @param pConteoPlaquetas Plaquetas
	 */
	public void cambiarConteoPlaquetas(int pConteoPlaquetas) 
	{
		conteoPlaquetas = pConteoPlaquetas;
	}
   

}
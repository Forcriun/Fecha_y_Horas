/**
 * La clase FechaYHora permite representar un reloj completo con un display que muestra
 * la fecha y la hora en formato "dd-mm-aa hh:mm". Nos permite hacer avanzar un minuto la fecha
 * y hora almacenadas a trav�s de un m�todo sin par�metros que tiene en cuenta que todos los
 * meses tienen 30 d�as y s�lo contempla los a�os del 2001 al 2099.
 * 
 * Se pueden fijar una fecha y hora determinadas por medio un m�todo que requiere de cinco
 * par�metros enteros, ya que la fecha por defecto de los objetos de la clase es el uno de
 * enero de 2001.
 */
public class FechaYHora
{
    // D�a, mes y a�o del display completo.
    private CalendarioBasico calendario;
    // Hora del display completo.
    private ClockDisplay reloj;

    /**
     * Constructor de la clase FechaYHora. Aprovecha la funcionalidad de clases previamente
     * creadas en el m�dulo (CalendarioBasico, ClockDisplay)
     */
    public FechaYHora()
    {
        calendario = new CalendarioBasico();
        reloj = new ClockDisplay();
    }

    /**
     * M�todo que avanza la fecha y la hora en un minuto.
     * 
     * Compara el estado del campo del objeto de la clase NumberDisplay que crea
     * la clase ClockDisplay.
     */
    public void avanzar()
    {
        reloj.timeTick();
        if(reloj.hours.getValue() == 0){
            calendario.avanzarFecha();
        }
    }

    /**
     * M�todo que permite fijar la fecha y la hora siempre que se introduzcan valores v�lidos.
     */
    public void fijarFechaYHora(int nDia,int nMes,int nAno, int nHora, int nMin)
    {
        calendario.fijarFecha(nDia,nMes,nAno);
        reloj.setTime(nHora,nMin);
    }

    /**
     * M�todo para obtener el display completo (fecha y hora) en una cadena con formato
     * "dd-mm-aa hh:mm".
     */
    public String getFechaYHora()
    {
        String fecha = calendario.obtenerFecha() + " " + reloj.getTime();
        return fecha;
    }
}




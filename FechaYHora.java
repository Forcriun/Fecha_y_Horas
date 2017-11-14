/**
 * La clase FechaYHora permite representar un reloj completo con un display que muestra
 * la fecha y la hora en formato "dd-mm-aa hh:mm". Nos permite hacer avanzar un minuto la fecha
 * y hora almacenadas a través de un método sin parámetros que tiene en cuenta que todos los
 * meses tienen 30 días y sólo contempla los años del 2001 al 2099.
 * 
 * Se pueden fijar una fecha y hora determinadas por medio un método que requiere de cinco
 * parámetros enteros, ya que la fecha por defecto de los objetos de la clase es el uno de
 * enero de 2001.
 */
public class FechaYHora
{
    // Día, mes y año del display completo.
    private CalendarioBasico calendario;
    // Hora del display completo.
    private ClockDisplay reloj;

    /**
     * Constructor de la clase FechaYHora. Aprovecha la funcionalidad de clases previamente
     * creadas en el módulo (CalendarioBasico, ClockDisplay)
     */
    public FechaYHora()
    {
        calendario = new CalendarioBasico();
        reloj = new ClockDisplay();
    }

    /**
     * Método que avanza la fecha y la hora en un minuto.
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
     * Método que permite fijar la fecha y la hora siempre que se introduzcan valores válidos.
     */
    public void fijarFechaYHora(int nDia,int nMes,int nAno, int nHora, int nMin)
    {
        calendario.fijarFecha(nDia,nMes,nAno);
        reloj.setTime(nHora,nMin);
    }

    /**
     * Método para obtener el display completo (fecha y hora) en una cadena con formato
     * "dd-mm-aa hh:mm".
     */
    public String getFechaYHora()
    {
        String fecha = calendario.obtenerFecha() + " " + reloj.getTime();
        return fecha;
    }
}




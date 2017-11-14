/**
 * Write a description of class FechaYHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private CalendarioBasico calendario;
    private ClockDisplay reloj;

    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        // initialise instance variables
        calendario = new CalendarioBasico();
        reloj = new ClockDisplay();
    }
    
    /**
     * 
     */
    public void avanzar()
    {
        reloj.timeTick();
        if(reloj.hours.getValue() == 0){
            calendario.avanzarFecha();
        }
    }
    
    public void fijarFechaYHora(int nDia,int nMes,int nAno, int nHora, int nMin)
    {
        calendario.fijarFecha(nDia,nMes,nAno);
        reloj.setTime(nHora,nMin);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getFechaYHora()
    {
        String fecha = calendario.obtenerFecha() + " " + reloj.getTime();
        return fecha;
    }
}

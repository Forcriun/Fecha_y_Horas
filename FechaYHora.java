/**
 * Write a description of class FechaYHora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FechaYHora
{
    // instance variables - replace the example below with your own
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres ano;
    private NumberDisplay hora;
    private NumberDisplay min;

    /**
     * Constructor for objects of class FechaYHora
     */
    public FechaYHora()
    {
        // initialise instance variables
        dia = new DisplayDosCaracteres(31);
        mes = new DisplayDosCaracteres(13);
        ano = new DisplayDosCaracteres(100);
        hora = new NumberDisplay(24);
        min = new NumberDisplay(60);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getFechaYHora()
    {
        String fecha = dia.getTextoDelDisplay() + "-" + mes.getTextoDelDisplay() + "-" + ano.getTextoDelDisplay() + " " + hora.getDisplayValue() + ":" + 
            min.getDisplayValue();
        return fecha;
    }
}

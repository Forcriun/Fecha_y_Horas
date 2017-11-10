/**
 * This class acts as a basic calendar that lets the user change the default
 * value of its objects (1-1-1). The user can advance the date one step
 * at a time or set it at will. It can also return the date as a string
 * in "dd-mm-yy" format.
 * 
 * The calendar doesn't validate the values entered by the user, and it
 * doesn't check if the given year is a leap year. Only the years between
 * 2000 and 2099 will be taken into consideration. Every month will have
 * 30 days.
 *
 * @author (Dídac Fernández Fernández)
 * @version (01/11/2017)
 */
public class CalendarioBasico
{
    // Stores the day
    private DisplayDosCaracteres day;
    //Stores the month
    private DisplayDosCaracteres month;
    // Stores the year
    private DisplayDosCaracteres year;

    /**
     * Constructor for objects of class CalendarioBasico.
     */
    public CalendarioBasico()
    {
        // initialise instance variables
        day = new DisplayDosCaracteres(31);
        month = new DisplayDosCaracteres(13);
        year = new DisplayDosCaracteres(100);

    }

    /**
     * Sets the date for the calendar according to the values introduced
     * by the user. Keep in mind the year will be entered as a two digit
     * maximum value (e.g.: 16 for the year 2016, and 7 for the year 2007).
     */
    public void fijarFecha(int newDay,int newMonth,int newYear)
    {
        day.setValorAlmacenado(newDay);
        month.setValorAlmacenado(newMonth);
        year.setValorAlmacenado(newYear);

    }

    /**
     * Advances the date one day, and considering every month of the year has
     * 30 days and every year has 12 months, it acts accordingly so for both
     * the month and the year values.
     */
    public void avanzarFecha()
    {
        day.incrementaValorAlmacenado();
        if(day.getValorAlmacenado() == 1){
            month.incrementaValorAlmacenado();
            if(month.getValorAlmacenado() == 1){
                year.incrementaValorAlmacenado();
            }
        }

    }

    /**
     * Returns the date as a string in the given format ("01-01-01").
     */
    public String obtenerFecha()
    {
        String date;
        date = day.getTextoDelDisplay() + "-" + month.getTextoDelDisplay() + "-" + year.getTextoDelDisplay();
        return date;
    }
}

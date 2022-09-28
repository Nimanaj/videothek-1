package video_rental.customer;

public class Customer {
    String vorname = "";
    String nachname = "";
    int alter = 0;
    int kundennummer = 0;

    public static int generieren = 0;

/**
 * 
 * @param vorname
 * @param nachname
 * @param alter
 */
    public Customer(String vorname, String nachname, int alter){
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
/**
 * 
 */
    public void generieren(){
        this.kundennummer = generieren;
        generieren ++;
    }
/**
 * 
 * @return
 */
    public String getVorname(){
        return vorname + " " + nachname;
    }
/**
 * 
 * @return
 */
    public int getAlter(){
        return alter;
    }
/**
 * 
 * @return
 */
    public int getKundennummer(){
        return kundennummer;
    }
    
/**
 * 
 * @param neuerNachname
 */
    public void setNachname(String neuerNachname){
        this.nachname = neuerNachname;
    }

}

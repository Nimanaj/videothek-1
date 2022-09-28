package video_rental.material;

public class CD {
    //Aufgabe 2b (HA1)
    String titel = "";
    double verleihpreis = 0.00;
    boolean angebot = false;
    double rabattpreis = 0.00;
    
/**
 * 
 * @param t
 */
    public void setTitel(String t){
        titel = t;
    }

/**
 * 
 * @param v
 */
    public void setVerleihpreis(double v){
        verleihpreis = v;
    }

/**
 * 
 * @param a
 */
    public void setAngebot(boolean a){
        angebot = a;
    }

/**
 * 
 * @param r
 */
    public void setRabattpreis(double r){
        rabattpreis = r;
    }

/**
 * 
 * @param t
 * @param v
 * @param a
 * @param r
 */
    public CD(String t, double v, boolean a, double r){
        titel = t;
        verleihpreis = v;
        angebot = a;
        rabattpreis = r;
    }

/**
 * 
 * @return
 */
    public String getTitle(){
        return titel;
    }

/**
 * 
 * @return
 */
    public double getPrice(){
        if(angebot){
            return rabattpreis;
        }else{
            return verleihpreis;
        }
    }

/**
 * 
 * @return
 */
    public String str(){
        
        if(angebot){
            return String.format("[DVD: " + titel + ", %.2f EUR]",rabattpreis);
        } else {
            return String.format("[DVD: " + titel + ", %.2f EUR]",verleihpreis);
        }
    }

}

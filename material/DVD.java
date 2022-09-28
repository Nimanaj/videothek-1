package video_rental.material;

public class DVD {
    //Aufgabe 2b (HA1)
    String titel = "";
    double verleihpreis = 0.0;
    boolean angebot = false;
    double rabattpreis = 0.0;

    public void setTitel(String t){
        titel = t;
    }

    public void setVerleihpreis(double v){
        verleihpreis = v;
    }

    public void setAngebot(boolean a){
        angebot = a;
    }

    public void setRabattpreis(double r){
        rabattpreis = r;
    }

    public DVD(String t, double v, boolean a, double r){
        titel = t;
        verleihpreis = v;
        angebot = a;
        rabattpreis = r;
    }

    public String getTitle(){
        return titel;
    }

    public double getPrice(){
        if(angebot){
            return rabattpreis;
        }else{
            return verleihpreis;
        }
    }    

    public String str(){
        
        if(angebot){
            return String.format("[DVD: " + titel + ", %.2f EUR]",rabattpreis);
        } else {
            return  String.format("[DVD: " + titel + ", %.2f EUR]",verleihpreis);
        }
    }
}

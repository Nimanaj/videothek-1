package video_rental.inventory;

import video_rental.material.*;

public class Inventory {
    DVD inventarDVD[] = new DVD[10];
    CD inventarCD[] = new CD[10];


    private final static int l = 10;
/**
 * 
 * @param item
 */
    public void addDVD(DVD item){
        for(int i = 0; i < l; i++){
            if(inventarDVD[i] == null){
                inventarDVD[i] = item;
                break;
            }
        }
    }
    
/**
 * 
 * @return
 */
    public DVD[] getDVDs(){
        return inventarDVD;
    }

/**
 * 
 * @param item
 */
    public void addCD(CD item){
        for(int i = 0; i < l; i++){
            if(inventarCD[i] == null){
                inventarCD[i] = item;
                break;
            }
        }
    }

/**
 * 
 * @return
 */
    public CD[] getCDs(){
        return inventarCD;
    }

/**
 * 
 * @return
 */
    public String str(){   

        String str = "Inventar:\nDVDs\n";
        
        for(int i = 0; i < l; i++){
            if(inventarDVD[i] == null){
                break;
            }
            String result = inventarDVD[i].str();
            str += " " + result + "\n";
        }

        str += "\nCDs\n";
        for(int i  = 0; i < l; i++){
            if(inventarCD[i] == null){
                break;
            }
            String result = inventarCD[i].str();
            str += " " + result + "\n";
        }
        return str;
    }
}
// File : Restourant.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author Letivany Aldina - 13514067
 */
public class Restourant extends Cell implements Facility {
    private String tipe = "restourant";
    public Restourant(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public String getTipe(){
        return tipe;
    }
}

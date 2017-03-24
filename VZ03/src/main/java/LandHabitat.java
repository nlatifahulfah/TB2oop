// File : LandHabitat.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author user
 */
public class LandHabitat extends Cell implements Habitat {
    private String tipe = "land";
    public LandHabitat(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public String getTipe(char s){
        return tipe;
    }
}

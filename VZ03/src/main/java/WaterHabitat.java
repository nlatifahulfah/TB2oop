// File : WaterHabitat.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author user
 */
public class WaterHabitat extends Cell implements Habitat {
    private String tipe = "water";
    public WaterHabitat(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public String getTipe(char s){
        return tipe;
    }
}

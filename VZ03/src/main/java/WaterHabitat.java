// File : WaterHabitat.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author Letivany Aldina - 13514067
 */
public class WaterHabitat extends Cell implements Habitat {
    private final String tipeCell = "water";
    private final char simbol = 'w';
    public WaterHabitat(int x, int y){
        super(x,y);
    }
    
    /**
     * mengembalikan tipe Cell dari WaterHabitat
     * @return string tipe Cell
     */
    @Override
    public String getTipeCell(){
        return tipeCell;
    }
    
    /**
     * mengembalikan simbol Cell
     * @return char simbol Cell
     */
    public char getSimbol(){
        return simbol;
    }
}

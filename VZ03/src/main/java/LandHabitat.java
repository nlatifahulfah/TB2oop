// File : LandHabitat.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author Letivany Aldina - 13514067
 */
public class LandHabitat extends Cell implements Habitat {
    private final String tipeCell = "land";
    private final char simbol = 'l';
    
    /**
     * Constructor Land Habitat
     * @param x posisi x Cell
     * @param y posisi y Cell
     */
    public LandHabitat(int x, int y){
        super(x,y);
    }
    
    /**
     * mengembalikan tipe Cell dari habitat land
     * @param s
     * @return 
     */
    @Override
    public String getTipeCell(){
        return tipeCell;
    }
    
    /**
     * mengembalikan simbol Cell
     * @return simbol Cell
     */
    @Override
    public char render(){
        return simbol;
    }
}

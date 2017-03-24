// File : AirHabitat.java
//PIC   : Letivany Aldina - 13514067

/**
 *
 * @author user
 */
public class AirHabitat extends Cell implements Habitat {
    private final String tipeCell = "air";
    private final char simbol = 'a';
    
    /**
     * Constructor AirHabitat
     * @param x posisi x Cell
     * @param y posisi y Cell
     */
    public AirHabitat(int x, int y){
        super(x,y);
    }
    
    /**
     * mengembalikan tipe Cell dari Air Habitat
     * @return string tipe Cell
     */
    @Override
    public String getTipeCell(char s){
        return tipeCell;
    }
    
    /**
     * mengembalikan simbol Cell Air Habitat
     * @return simbol Cell
     */
    public char getSimbol(){
        return simbol;
    }
}

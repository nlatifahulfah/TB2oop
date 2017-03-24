// File : Entrance.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author user
 */
public class Entrance extends Cell implements Facility {
    private final String tipeCell = "entrance";
    private final char simbol = 'n';
    
    /**
     * constructor kelas
     * @param x posisi x Cell 
     * @param y posisi y Cell
     */
    public Entrance(int x, int y){
        super(x,y);
    }
    
    /**
     * mengembalikan tipe Cell dari entrance
     * @return string tipe Cell
     */
    @Override
    public String getTipeCell(){
        return tipeCell;
    }
    
    /**
     * mengembalikan simbol tipe Cell
     * @return char simbol Cell
     */
    public char getSimbol(){
        return simbol;
    }
}

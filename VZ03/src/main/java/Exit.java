// File : Exit.java
// PIC  : Letivany Aldina - 13514067
/**
 *
 * @author user
 */
public class Exit extends Cell implements Facility {
    private final String tipeCell = "exit";
    private final char simbol = 'x';
    
    /**
     * constructor kelas
     * @param x posisi x Cell
     * @param y posisi y Cell
     */
    public Exit(int x, int y){
        super(x,y);
    }
    
    /**
     * mengembalikan tipe Cell dari exit
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

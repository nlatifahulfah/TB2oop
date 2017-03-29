// File : Park.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author Letivany Aldina - 13514067
 */
public class Park extends Cell implements Facility {
    private final String tipeCell = "park";
    private final char simbol = '*';
    /**
     * constructor kelas
     * @param x posisi x Cell
     * @param y posisi y Cell
     */
    public Park(int x, int y){
        super(x,y);
    }
    
    /**
     * mengembalikan tipe Cell dari park
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
    @Override
    public char render(){
        return simbol;
    }
}

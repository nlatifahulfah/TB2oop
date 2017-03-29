// File : Road.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author Letivany Aldina - 13514067
 */
public class Road extends Cell implements Facility {
    private final String tipeCell = "road";
    private final char simbol = '-';
    /**
     * Constructor kelas Road
     * @param x posisi x cell road
     * @param y posisi y cell road
     */
    public Road(int x, int y){
        super(x,y);
    }
    
    /**
     * mengembalikan tipe Cell dari road
     * @return string tipe Cell
     */
    @Override
    public String getTipeCell(){
        return tipeCell;
    }
    
    /**
     * mengembalikan simbol Cell dari road
     * @return char simbol Cell
     */
    @Override
    public char render(){
        return simbol;
    }
}

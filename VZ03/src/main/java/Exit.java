// File : Exit.java
// PIC  : Letivany Aldina - 13514067
<<<<<<< HEAD

=======
>>>>>>> 547e9d1ee4f245a7dd9e3a1783f653021786f6b2
/**
 *
 * @author Letivany Aldina - 13514067
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

// File : Park.java
// PIC  : Letivany Aldina - 13514067
<<<<<<< HEAD

=======
>>>>>>> 547e9d1ee4f245a7dd9e3a1783f653021786f6b2
/**
 *
 * @author Letivany Aldina - 13514067
 */
public class Park extends Cell implements Facility {
    private final String tipeCell = "park";
    private final char simbol = 'p';
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
    public char getSimbol(){
        return simbol;
    }
}

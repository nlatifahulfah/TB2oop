// File : Restourant.java
// PIC  : Letivany Aldina - 13514067
<<<<<<< HEAD

=======
>>>>>>> 547e9d1ee4f245a7dd9e3a1783f653021786f6b2
/**
 *
 * @author Letivany Aldina - 13514067
 */
public class Restourant extends Cell implements Facility {
    private final String tipeCell = "restourant";
    private final char simbol = 'r';
    /**
     * constructor kelas
     * @param x posisi x Cell
     * @param y posisi y Cell
     */
    public Restourant(int x, int y){
        super(x,y);
    }
    /**
     * mengembalikan tipe Cell dari restourant
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

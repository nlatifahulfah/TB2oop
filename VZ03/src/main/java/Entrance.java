// File : Entrance.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author user
 */
public class Entrance extends Cell implements Road {
    private String tipe = "entrance";
    public Entrance(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public getTipe(){
        return tipe;
    }
}

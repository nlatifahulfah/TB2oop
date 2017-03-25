// File : Exit.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author Letivany Aldina - 13514067
 */
public class Exit extends Cell implements Road {
    private String tipe = "exit";
    public Exit(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public String getTipe(){
        return tipe;
    }
}

// File : Park.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author Letivany Aldina - 13514067
 */
public class Park extends Cell implements Facility {
    private String tipe = "park";
    public Park(int x, int y, char s){
        super(x,y,s);
    }
    
   
    @Override
    public getTipe(){
        return tipe;
    }
}

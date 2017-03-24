// File : Road.java
// PIC  : Letivany Aldina - 13514067
/**
 * 
 * @author user
 */
public class Road extends Cell implements Facility {
    private String tipe = "road";
    public Road(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public String getTipe(){
        return tipe;
    }
}

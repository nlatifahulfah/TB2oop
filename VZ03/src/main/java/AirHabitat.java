// File : AirHabitat.java
//PIC   : Letivany Aldina - 13514067

/**
 *
 * @author user
 */
public class AirHabitat extends Cell implements Habitat {
    private String tipe = "air";
    public AirHabitat(int x, int y, char s){
        super(x,y,s);
    }
    
    
    @Override
    public String getTipe(){
        return tipe;
    }
}

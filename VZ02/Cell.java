// File : Cell.java
// PIC : Letivany Aldina - 13514067

/**
 *
 * @author Letivany Aldina - 13514067
 */
public class Cell {
    private int x;
    private int y;
    private String tipeCell;
    private char simbol;
    
    public Cell(int x, int y, char s) {
        this.x = x;
        this.y = y;
        simbol = s;
        
        
        if (s=='~'){
            tipeCell = "water";
        }
        else if (s=='@'){
            tipeCell = "land";
        }
        else if (s=='#'){
            tipeCell = "air";
        }
        else if (s=='*'){
            tipeCell = "park";
        }
        else if (s=='-'){
            tipeCell = "road";
        }
        else if (s=='\\'){
            tipeCell = "entrance";
        }
        else if (s=='/'){
            tipeCell = "exit";
        }
        else if (s=='$'){
            tipeCell = "restourant";
        }
    }
    
    public String getTipe(){
        return tipeCell;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public char render(){
		return simbol;
	}
}

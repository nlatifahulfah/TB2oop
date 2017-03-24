// File : Cell.java
// PIC  : Letivany Aldina - 13514067

/**
 *
 * @author user
 */
abstract class Cell implements Renderable {
    private int x;
    private int y;
    private String tipeCell;
    
    /**
     * konstruktor sebuah Cell
     * @param x posisi x sebuah Cell
     * @param y posisi y sebuah Cell
     * @param s simbol s sebuah Cell
     */
    public Cell (int x, int y, char s){
        this.x = x;
        this.y = y;
        
        if (s=='w'){
            tipeCell = "water";
        }
        else if (s=='l'){
            tipeCell = "land";
        }
        else if (s=='a'){
            tipeCell = "air";
        }
        else if (s=='p'){
            tipeCell = "park";
        }
        else if (s='r'){
            tipeCell = "road";
        }
        else if (s=='n'){
            tipeCell = "entrance";
        }
        else if (s=='x'){
            tipeCell = "exit";
        }
        else if (s=='t'){
            tipeCell = "restourant";
        }
    }
    
    /**
     * mendapatkan tipe sebuah Cell
     * @param s simbol dari Cell
     * @return string tipe Cell
     */
    public abstract String getTipe(char s);
    
    /**
     * mendapatkan posisi x
     * @return nilai x
     */
    public int getX(){
        return x;
    }
    
    /**
     * mendapatkan posisi y
     * @return nilai y
     */
    public int getY(){
        return y;
    }
    
    /**
     * set nilai x
     * @param x nilai x yang diset
     */
    public void setX(int x){
        this.x = x;
    }
    
    /**
     * set nilai y
     * @param y nilai y yang diset
     */
    public void setY(int y){
        this.y = y
    }
}

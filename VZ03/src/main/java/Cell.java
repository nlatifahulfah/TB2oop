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
     */
    public Cell (int x, int y){
        this.x = x;
        this.y = y;
    }
    
    /**
     * mendapatkan tipe sebuah Cell
     * @param s simbol dari Cell
     * @return string tipe Cell
     */
    public abstract String getTipeCell();
    
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
        this.y = y;
    }
}

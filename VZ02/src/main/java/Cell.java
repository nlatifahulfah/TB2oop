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
    
  /**
  * konstruktor sebuah Cell
  *
  * @param x posisi x sebuah Cell
  * @param y posisi y sebuah Cell
  * @param s simbol sebuah Cell
  */
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
  
  /**
  * mendapatkan tipe sebuah Cell
  * 
  * @return string tipe Cell
  */
  public String getTipe(){
    return tipeCell;
  }
  
  /**
  * mendapatkan posisi x
  * 
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
  
  /**
  * Getter SIMBOL.
  * Mengembalikan nilai SIMBOL.
  * 
  * @return SIMBOL
  */
  public char render(){
    return simbol;
  }
}

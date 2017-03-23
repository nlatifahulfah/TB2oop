// File : Cell.java
// PIC : Letivany Aldina - 13514067

public class Cell {
    private int x;
    private int y;
    private String tipeCell;
    
    public void Cell(int x, int y, char s) {
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
        else if (s=='r'){
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
    
    public String getTipe(char s){
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
    
}

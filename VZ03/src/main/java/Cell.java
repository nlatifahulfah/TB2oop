/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
abstract class Cell implements Renderable {
    private int x;
    private int y;
    private String tipeCell;
    
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
    
    public abstract String getTipe(char s);
    
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
        this.y = y
    }
}

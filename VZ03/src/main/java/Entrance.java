/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Entrance extends Cell implements Road {
    private String tipe = "entrance";
    public Entrance(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public getTipe(){
        return tipe;
    }
}

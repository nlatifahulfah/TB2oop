/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Exit extends Cell implements Road {
    private String tipe = "exit";
    public Exit(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public String getTipe(){
        return tipe;
    }
}

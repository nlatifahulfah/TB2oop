/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Park extends Cell implements Facility {
    private String tipe = "park";
    public Park(int x, int y, char s){
        super(x,y,s);
    }
    
   
    @Override
    public getTipe(){
        return tipe;
    }
}

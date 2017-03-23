/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class AirHabitat extends Cell implements Habitat {
    private String tipe = "air";
    public AirHabitat(int x, int y, char s){
        super(x,y,s)
    }
    
    
    @Override
    public String getTipe(){
        return tipe;
    }
}

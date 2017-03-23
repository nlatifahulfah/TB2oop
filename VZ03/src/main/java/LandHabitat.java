/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class LandHabitat extends Cell implements Habitat {
    private String tipe = "land";
    public LandHabitat(int x, int y, char s){
        super(x,y,s);
    }
    
    @Override
    public String getTipe(char s){
        return tipe;
    }
}

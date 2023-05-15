/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class Song {
    
    private String name;
    private int lenght;

    public Song(String name, int lenght) {
        this.name = name;
        this.lenght = lenght;
    }
    
    public String name(){
        return this.name;
    }
    
    public int length(){
        return this.lenght;
    }
    
    
}

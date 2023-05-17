/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class Cube {
    private int edgeLenght;

    public Cube(int edgeLenght) {
        this.edgeLenght = edgeLenght;
    }
    
    public int volume(){
        return edgeLenght * edgeLenght * edgeLenght ;
    }

    @Override
    public String toString() {
        return "The lenght of the edge is " + edgeLenght + " and the volume " + volume(); 
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */

import java.util.ArrayList;

public class Hold {
     private ArrayList<Suitcase> hold;
     private int maxWeight;
     private int totalWeight;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + this.totalWeight <= this.maxWeight){
            this.totalWeight += suitcase.totalWeight();
            this.hold.add(suitcase);
        }
    }

    @Override
    public String toString() {
         if(this.hold.isEmpty()){
            return  "no suitcases (" +  this.totalWeight + "kg)";
        }
        if(this.hold.size() == 1){
            return this.hold.size() + "suitcase (" + this.totalWeight + "kg)";  
        }
        
        return this.hold.size() + "suitcases (" + this.totalWeight +"kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase : hold){
            suitcase.printItems();
        }
    }
    
    
    
    
     
     
    
    
}

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
public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.suitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }
    
    public void addItem(Item item){
            if(item.getWeight() + this.totalWeight <= this.maxWeight){
            this.totalWeight += item.getWeight();
            this.suitcase.add(item);
        }
    }

    @Override
    public String toString() {
        if(this.suitcase.isEmpty()){
            return  "no items (" +  this.totalWeight + "kg)";
        }
        if(this.suitcase.size() == 1){
            return this.suitcase.size() + "item (" + this.totalWeight + "kg)";  
        }
        
        return this.suitcase.size() + "items (" + this.totalWeight +"kg)";
    }
    
    public void printItems(){
        for(Item items : suitcase){
            System.out.println(items);
        }
    }

    public int totalWeight() {
        return totalWeight;
    }
    
    public Item heaviestItem(){
        
        if(suitcase.size() == 0){
            return null;
        }
        Item heaviest = new Item(suitcase.get(0).getName(),suitcase.get(0).getWeight());
        for(Item items : suitcase){
            if(items.getWeight() >= heaviest.getWeight()){
                heaviest = items;
            }
        }
        return heaviest;
    }
    
}

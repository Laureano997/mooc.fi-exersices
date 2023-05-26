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
public class Stack {
    
    private ArrayList<String> stack; 

    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    
    public void add(String value){
        stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack;
    }
    
    public String take(){
        int lastIndex = stack.size();
        String last = stack.get(lastIndex - 1);
        stack.remove(lastIndex - 1);
        return last;
     }
}

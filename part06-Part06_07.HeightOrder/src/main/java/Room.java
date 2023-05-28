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
public class Room {
    
    private ArrayList<Person> peopleList;
    
    public Room(){
        this.peopleList = new ArrayList<>();
    }
    
    public void add(Person person){
        this.peopleList.add(person);
    }
    
    public boolean isEmpty(){
        if(this.peopleList.isEmpty()){
            return true;
        }
        return false;
    }
    
    public ArrayList<Person> getPersons(){
        return peopleList;
    }
    
    public Person shortest(){
        if(this.peopleList.isEmpty()){
            return null;
        }
        
        Person shortest = new Person(peopleList.get(0).getName(),peopleList.get(0).getHeight());
        
        for(Person person : peopleList){
            if(person.getHeight() < shortest.getHeight()){
                shortest.setHeight(person.getHeight());
                shortest.setName(person.getName());
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(this.peopleList.isEmpty()){
            return null;
        }
        Person shortest = Room.this.shortest() ;
        this.peopleList.remove(shortest);
        return shortest;
    }
    
}

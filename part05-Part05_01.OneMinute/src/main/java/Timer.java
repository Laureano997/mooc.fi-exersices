/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class Timer {
    private ClockHand hundrethSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundrethSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public void advance(){
        this.hundrethSeconds.advance();
        if(this.hundrethSeconds.value() == 0){
            this.seconds.advance();
            
        }
        
    }

    public ClockHand getHundrethSecods() {
        return hundrethSeconds;
    }

    public ClockHand getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return seconds + ":" + hundrethSeconds; 
    }
    
    
    
    
    

    
    
    
}

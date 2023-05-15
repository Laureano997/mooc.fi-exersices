/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class PaymentCard {
    
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    public void eatAffordably(){
        if (this.balance >= 2.60){
        
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily(){
        if(this.balance >= 4.60){
        
            this.balance -= 4.60;
        }
    }
    
    @Override
    public String toString() {
        return  "The card has a balance of " + balance + " euros" ;
    }
    
    public void addMoney (double amount){
        if(amount > 0){
        if(this.balance + amount >= 150){
            this.balance = 150;
        }else{
            this.balance += amount ;
        
        }
        
        }
    }
    
}

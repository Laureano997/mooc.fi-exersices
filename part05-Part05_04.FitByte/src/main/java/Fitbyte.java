/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class Fitbyte {
    private int age;
    private int restingHeathRate;

    public Fitbyte(int age, int restingHeathRate) {
        this.age = age;
        this.restingHeathRate = restingHeathRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        double maxRate = 206.3 - (0.711 * age);
        return (maxRate - restingHeathRate) * (percentageOfMaximum) + restingHeathRate;
    }
}

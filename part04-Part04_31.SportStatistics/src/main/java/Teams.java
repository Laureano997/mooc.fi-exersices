/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class Teams {
    
    private String homeTeam;
    private String visitTeam;
    private int homePoints;
    private int visitPoints;

    public Teams(String homeTeam, String visitTeam, int homePoints, int visitPoints) {
        this.homeTeam = homeTeam;
        this.visitTeam = visitTeam;
        this.homePoints = homePoints;
        this.visitPoints = visitPoints;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getVisitTeam() {
        return visitTeam;
    }

    public int getHomePoints() {
        return homePoints;
    }

    public int getVisitPoints() {
        return visitPoints;
    }

   
    
    
    
}


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File name:");
        String file = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();
        ArrayList<Teams> records = getTeamsData(file);
        int gamesplayed = 0 , wins = 0 , losses = 0 ;
        
        for(Teams teams : records){
            if(teams.getHomeTeam().equals(team)){
                gamesplayed ++;
                if(teams.getHomePoints() > teams.getVisitPoints()){
                    wins++;
                }else{
                    losses++;
                }
            }else if(teams.getVisitTeam().equals(team)){
                gamesplayed ++;
                if(teams.getHomePoints() < teams.getVisitPoints()){
                    wins++;
                }else{
                    losses++;
                }
            }
        }//end for each
        System.out.println("Games: " + gamesplayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Teams> getTeamsData(String file){
       ArrayList<Teams> team = new ArrayList<>(); 
       try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String[] row = sc.nextLine().split(",");
                team.add(new Teams(row[0],row[1],Integer.valueOf(row[2]),Integer.valueOf(row[3])));
            }
        
        } catch(Exception e){
            System.out.println("Error: " + e);    
        }    
        return  team;
    }
}

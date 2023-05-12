
import java.util.Scanner;

public class NameOfTheOldest {

   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String[] oldest = new String[2];
        oldest[1]= String.valueOf("0");
        while(true){
             input = scanner.nextLine();
            if(input.isEmpty()){
                break;
        
            }else{
               
                String[] people = input.split(",");
                if(Integer.valueOf(oldest[1]) < Integer.valueOf(people[1]) ){
                    oldest[0] = people[0];
                    oldest[1] = people[1];
                }
        
            }
        }
        System.out.println("Name of the oldest: " + oldest[0]);

   }
}

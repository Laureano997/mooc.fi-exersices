
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        Integer[] oldest = new Integer[1];
        oldest[0] = 0;
        while(true){
             input = scanner.nextLine();
            if(input.isEmpty()){
                break;
        
            }else{
               
                String[] people = input.split(",");
                if(oldest[0] < Integer.valueOf(people[1])){
                oldest[0] = Integer.valueOf(people[1]);
                }
        
            }
        }
        System.out.println("Age of the oldest: " + oldest[0]);


    }
}

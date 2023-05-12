
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int sumNumbers = 0 , evenNumbers = 0 , oddNumbers = 0 , count = 0;
        float average = 0;      
        while(true){
            int number = scanner.nextInt();
            if(number == -1){
                
                break;
            }else{
                sumNumbers += number;
                count++;
                if(number %2 == 0){
                    evenNumbers++;
                }else{
                    oddNumbers++;
                }
            }
            
        }
      
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumNumbers);
        System.out.println("Numbers: " + count);
        
    

    }
}

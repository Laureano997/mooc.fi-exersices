
import java.util.Scanner;


public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printUntilNumber(number);
        

    }
    
    public static void printUntilNumber (int number){
        int i = 1;
        while(i <= number){
            System.out.println(i);
            i++;
        }
    }
}
   

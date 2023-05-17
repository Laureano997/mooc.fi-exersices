
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while(true){
            System.out.println("Type: ");
            
            if(scanner.nextLine().equals("end")){
                break;
            }
            max++;
        }
        System.out.println(max);
    }
}

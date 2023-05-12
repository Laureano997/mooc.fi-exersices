
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String[] input = scanner.nextLine().split(" ");
            if(input[0].isEmpty()){
                break;
            }
            int lastinput = input.length;
            System.out.println(input[lastinput-1]);
        }


    }
}

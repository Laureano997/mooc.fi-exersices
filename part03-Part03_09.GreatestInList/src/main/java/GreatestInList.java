
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        int biggest = 0;
        // implement finding the greatest number in the list here
        for(int i = 0 ; i < list.size() ; i++){
            if(biggest > list.get(i)){
                
            }else{
                biggest = list.get(i);
            }
        }
        System.out.println(biggest);
    }
}

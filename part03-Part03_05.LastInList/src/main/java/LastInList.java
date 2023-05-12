
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LastInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }else{

            list.add(input);
            }
        }
        if(list.isEmpty()){
            System.out.println("nothing in list");
        }else{
            i = list.size();
            System.out.println(list.get(i-1));
    
        }

    }
}

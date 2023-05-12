
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            System.out.println("Give a number:");
            int number = scanner.nextInt();
            if(number == 9999){
                break;
            }else{
                list.add(number);
            }
        }
        int smallest = list.get(0);
        for(int i = 1 ; i < list.size() ; i++){
            if(list.get(i) < smallest ){
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: " + smallest);
        for(int i = 0 ; i < list.size();i++){
            if(list.get(i).equals(smallest)){
                System.out.println("Found at index: " + i);
            }
        }
        

        
    }
}

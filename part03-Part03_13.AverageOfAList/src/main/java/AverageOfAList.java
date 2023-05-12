
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> list = new ArrayList<>();
       while(true){
           System.out.println("Give a number: ");
           int number = scanner.nextInt();
           if(number == -1){
               break;
           }else{
               list.add(number);
           }
       }
       int sum = 0 , numbers = 0;
       for(Integer number : list){
           sum +=number;
           numbers++;
       }
        System.out.println("Avegare: " + ((float)sum/numbers));
    }
}

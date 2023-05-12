
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
        String[] array = scanner.nextLine().split(" ");
        for(String text : array){
            System.out.println(text);
        
        }      
        
        }


    }
}

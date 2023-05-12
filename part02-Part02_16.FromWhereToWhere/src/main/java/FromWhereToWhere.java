
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int finish = scanner.nextInt();
        int start = scanner.nextInt();
        for(int i = start ; i <= finish ; i++){
            if(start > finish){
                break;
            }else{
                System.out.println(i);
            }
        }
        
    }
}


import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number? ");
        int number = scanner.nextInt();
        int sumNumbers = 0;
        for(int i = 0 ; i <= number ; i++){
            sumNumbers += i;
        }
        System.out.println(sumNumbers);
    }
}

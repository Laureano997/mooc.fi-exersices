import java.util.Scanner;

public class FromParameterToOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        printFromNumberToOne(number);
       
    }

    
    public static void printFromNumberToOne(int number){
        int i = 1;
        while(i <= number){
            System.out.println(number);
            number--;
        }
    }
}

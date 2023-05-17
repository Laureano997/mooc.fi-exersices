
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int amountNumbers = 0;
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                int number = Integer.valueOf(row);
                if(number >= lowerBound && number <= upperBound){
                    amountNumbers++;
                }
            }// end of while
        }// end of try
        catch(Exception e){
            System.out.println("Error:" + e);
        }
        
        System.out.println("Numbers: " + amountNumbers);
    }

}

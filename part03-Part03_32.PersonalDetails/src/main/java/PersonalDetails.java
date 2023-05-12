
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumYears = 0,years = 0;
        String[] people = new String[2]; 
        people[0]= " ";
        while(true){
            String input = scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            String[] temp = input.split(",");
            
            if(people[0].length() < temp[0].length() || people[0].isEmpty()){
            people = input.split(",");
            sumYears += Integer.valueOf(temp[1]);
            years++;
            }else{
                sumYears += Integer.valueOf(temp[1]);
                years++;
            }
       
        }
        System.out.println("Longest name: " + people[0]);
        System.out.println("Average of the birth years: " + (double)sumYears/years);

    }
}

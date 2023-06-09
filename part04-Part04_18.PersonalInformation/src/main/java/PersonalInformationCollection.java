    
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter name, empty will stop: ");
            String firstName = scanner.nextLine();
            
             if(firstName.isEmpty()){
                break;
            }
            
            System.out.println("Enter last name: ");
            String lastName = scanner.nextLine();
            System.out.println("Enter identification number: ");
            String idNumber = scanner.nextLine();
             
            infoCollection.add(new PersonalInformation(firstName,lastName,idNumber));
                   
        }//end of loop
        
        for(PersonalInformation pi : infoCollection){
            System.out.println(pi.getFirstName() + " " + pi.getLastName());
        }
    }
}

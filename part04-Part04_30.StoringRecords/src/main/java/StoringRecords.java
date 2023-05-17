
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();
        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
        
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        // get data from txt,save it in objects and put them in an array
        ArrayList<Person> persons = new ArrayList<>();
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                String[] data = row.split(",");
                Person person = new Person(data[0],Integer.valueOf(data[1]));
                persons.add(person);
            }// end of while
        }// end of try
        catch(Exception e){
            System.out.println("Error: " + e);
        }
        
        return persons;

    }
}

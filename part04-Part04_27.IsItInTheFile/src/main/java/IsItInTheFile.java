
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try(Scanner sc = new Scanner(Paths.get(file))){
            while(sc.hasNextLine()){
                String row = sc.nextLine();
                if(row.equals(searchedFor))
                    searchedFor = "Found!";
            } // end of while
        
        } // end of try 
        catch(Exception e){
        
            System.out.println("Reading the file nonexistent.txt failed.");
                    
        } // end of catch
        
        if(searchedFor.equals("Found!")){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }
        
    }
    
}

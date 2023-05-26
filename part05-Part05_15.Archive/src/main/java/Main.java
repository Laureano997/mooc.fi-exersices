
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String idenInput , nameInput;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while(true){
            System.out.println("Identifier? (empty will stop)");
            idenInput = scanner.nextLine();
             if(idenInput.isEmpty()){
                break;
            }  
            System.out.println("Name? (empty will stop)");
            nameInput = scanner.nextLine();
             if(nameInput.isEmpty()){
                break;
            } 
            
            Item item = new Item(idenInput,nameInput);
            
            if(items.contains(item)){
                continue;
            }else{
                items.add(item);
            }
            
        }
     
        System.out.println("==Items==");
         
        for(Item item : items){
            System.out.println(item);
        }
                
        
        
    }
}

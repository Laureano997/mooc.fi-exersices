import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Books> books = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Title: ");
            String title = scan.nextLine();
            if(title.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scan.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scan.nextLine());
            books.add(new Books(title,pages,year));   
        }
        System.out.println("What information will be printed?");
        String input = scan.nextLine();
        if(input.equals("everything")){
            for(Books book : books){
                System.out.println(book);
            }
        }else if (input.equals("name")){
            for(Books book : books){
                System.out.println(book.getTitle());
            }
        }

    }
}

import java.util.Scanner;
public class AdvancedAstrology {
    

    public static void printStars(int number) {
        for(int i = 0 ; i < number ; i ++){
            System.out.print("*");
        }
        System.out.println("");
        // part 1 of the exercise
    }

    public static void printSpaces(int number) {
        
        for(int i = 0 ; i < number ; i++){
            System.out.print(" ");
        }
        
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        int spaces = size;
        for(int i = 1 ; i <= size ;i++){
            printSpaces(spaces-= 1);
            printStars(i);
        }
       
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        for(int i = 1 ; i <= height ; i++){
            printSpaces(height - i);
            printStars(2 * i - 1);
            
        }
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        for(int i = 1 ; i < 3 ; i++){
            printSpaces(height - 2);
            printStars(3);
        }
        
        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        Scanner scan = new Scanner(System.in);
        //printTriangle(5);
        //System.out.println("---");
        christmasTree(4);
        scan.nextLine();
        System.out.println("---");
        christmasTree(10);
    }
}

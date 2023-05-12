
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        String stars = "";
        for(int i = 0 ; i < number ; i++){            
            stars += "*";
        }
        // first part of the exercise
        System.out.println(stars);
       
    }

    public static void printSquare(int size) {
        for(int i = 0 ; i < size ; i++){
            printStars(size);
        }
        // second part of the exercise
    }

    public static void printRectangle(int width, int height) {
        for(int i = 0 ; i < height ; i++){
            printStars(width);
        }
        
        
        // third part of the exercise
    }

    public static void printTriangle(int size) {
        int s = 0 ;
        for(int i = 0 ; i < size ; i++){
            
            printStars(s+=1);
            
        }
        // fourth part of the exercise
    }
}

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        
        // Once you have implemented the division method, you can
        // try it out here. Fopr example division(3,5);
        // should print "0.6"

        division(3, 5);
    }

    // implement the method here
    public static void division(int numerator, int denominator){
        System.out.println((float)numerator/denominator);
    }
}

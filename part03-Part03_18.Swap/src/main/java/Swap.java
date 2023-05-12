
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        // Implement here
        // asking for the two indices
        // and then swapping them

        System.out.println("Give two indices to swap:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        swapIndex(array,number1,number2);
        index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }
    
    public static void swapIndex (int array[] ,int number1,int number2){
        int temp = 0;
        temp = array[number1];
        array[number1]= array[number2];
        array[number2]= temp;
    }

}

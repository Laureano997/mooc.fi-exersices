

import java.util.Scanner;

public class IndexWasNotFound {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;
        System.out.println("Search for?");
        int searching = Integer.valueOf(scanner.nextLine());
        int[] index = new int[10];
        int j = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(searching == array[i]){
                index[j] = i;
                j++;
            }
        }
        if(index[0] != 0){
             for(int i = 0 ; i < j ; i++){
                 System.out.println(searching + " is at index " + index[i] + ".");
                 
                 }    
             }else{
            System.out.println(searching + " was not found.");
        }

        // Implement the search functionality here
    }

}


public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int lastNumber = array.length;
            for(int i = 0 ; i< array.length ; i++){
               if(lastNumber == i + 1){
                    System.out.print(array[i]);
                }else{
                   System.out.print(array[i] + ", ");    
               }
            }
        // Write some code in here
    }
}

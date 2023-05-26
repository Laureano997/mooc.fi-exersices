
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate today = new SimpleDate(1,1,1990);
        today.advance(1000);
        System.out.println(today);
    }
}

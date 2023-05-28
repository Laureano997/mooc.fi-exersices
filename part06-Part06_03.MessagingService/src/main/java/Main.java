
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        
        Message mensaje = new Message("Jake","hi");
        Message mensaje2 = new Message("Paul","hello");
        Message mensaje3 = new Message("Monica","Greetings");
        
        MessagingService mensajeria = new MessagingService();
        
        mensajeria.add(mensaje);
        mensajeria.add(mensaje2);
        mensajeria.add(mensaje3);
        
        System.out.println(mensajeria);
    }
}

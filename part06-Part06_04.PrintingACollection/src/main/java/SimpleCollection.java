
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        String printOutPut = "The collection " + this.name + " ";
        if(elements.isEmpty()){
            printOutPut = printOutPut + "is empty.";
            return printOutPut;
        }else{
        String finalPrintOutPut = "";
            for(String element : elements){
                finalPrintOutPut = finalPrintOutPut + "\n" + element;
            }
            if(elements.size() == 1){
                return printOutPut + "has " + elements.size() + " element:" + finalPrintOutPut;
            }else{
                return printOutPut + "has " + elements.size() + " elements:" + finalPrintOutPut;
            }
        }
    }
    
    
    
}

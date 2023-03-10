import java.util.*; 

public class IterationArrayList {
    public static void main(String[] args) {
        
    
    List<String> list_Strings= new ArrayList<String>();
    list_Strings.add("Red");
    list_Strings.add("Green"); 
    list_Strings.add("Orange");
    list_Strings.add("White");  
    list_Strings.add("black");
    for(String element: list_Strings)
    System.out.println(element);
    }
}
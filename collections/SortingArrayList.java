import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        
    
    List<String> list_Strings= new ArrayList<String>();
    list_Strings.add("Red");
    list_Strings.add("Green"); 
    list_Strings.add("Orange");
    list_Strings.add("White");  
    list_Strings.add("black");
    System.out.println("Before Sorting of the Array list is:"+list_Strings);
    Collections.sort(list_Strings);
    System.out.println("After sorting of the Array list is:"+list_Strings);

    }

}
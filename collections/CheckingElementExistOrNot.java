import java.util.*;
public class CheckingElementExistOrNot {
    public static void main(String[] args) {
        LinkedList <String> c1 = new LinkedList <String> ();
            c1.add("Red");
          c1.add("Green");
          c1.add("Black");
          c1.add("White");
          c1.add("Pink");
          System.out.println("Original linked list: " + c1);
          if (c1.contains("Green")) {
            System.out.println("Color Green is present in the linked list.");
         } else {
            System.out.println("Color Green is not present in the linked list.");
          }

          if (c1.contains("Orange")) {
            System.out.println("Color Orange is present in the linked list.");
         } else {
            System.out.println("Color Orange is not present in the linked list.");
          }
    }
    
}

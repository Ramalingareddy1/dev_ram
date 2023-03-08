import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {

   public static void addCat(List<? super Cat> catList) {
      catList.add(new RedCat());
      System.out.println("Cat Added");
   }
public static void main(String[] args) {
      List<Animal> animalList= new ArrayList<Animal>();
      List<Cat> catList= new ArrayList<Cat>();
     
      List<Dog> dogList= new ArrayList<Dog>();

    
      addCat(animalList);

      
      addCat(catList);
 
   }
}
class Animal {}

class Cat extends Animal {}

class Dog extends Animal {}
class RedCat extends Cat {}
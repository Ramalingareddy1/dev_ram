

public class GenericsTester {
    public static void main(String[] args) {
      System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximum( 3, 4, 5 ));  
    }

    public static < T extends Number & Comparable<T>>  T maximum( T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;   
         }
         if(z.compareTo(max) > 0) {
            max = z;                    
         }
         return max;
    }

    
}

// For a given set of Strings, print the largest string
// lexicographic order -
import java.util.*;

public class _Q21_LargestString {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};
        String largest = fruits[0];
        for(int i = 1; i < fruits.length; i++){
            if(largest.compareTo(fruits[i]) < 0)
            {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}

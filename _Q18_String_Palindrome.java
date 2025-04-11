// check if a string is a palindrome

// TIME COMPLEXITY - O(N)
import java.util.*;

public class _Q18_String_Palindrome
{
    public static boolean isPalindrome(String str)
    {
        for (int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() -1 - i)){
                // not a palindrome
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        String str = "racecar";
        System.out.println(isPalindrome(str));
    }
}

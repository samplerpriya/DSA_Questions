import java.util.*;

public class _Q20_PrintSubstring
{
    public static String substring(String str, int si, int ei)
    {
        String substr = "";
        for(int i = si; i < ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
//        System.out.println(substring(str, 0, 5));

        // this is the one line code to find the substring with the substring method
        System.out.println(str.substring(0, 5));
    }
}

import java.util.Stack;
import java.util.*;

public class _Q47_ValidParentheses
{
    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //opening
            if(ch == '(' || ch == '{' || ch == '{' || ch == '['){
                s.push(ch);
            }
            else{
                //closing
                if(s.isEmpty()){
                    return false;
                }
                if((s.peek() == '(' && ch == ')')  // ()
                    || (s.peek() == '{' && ch == '}')  // {}
                    || (s.peek() == '[' && ch == ']')){  //[]
                    s.pop();
                }

                else {
                    return false;
                }
            }
        }

        if(s.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }


    // duplicate parenthese
    public static boolean isDuplication(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);

            //closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count < 1){
                    return true;  //duplicate
                }
                else{
                    s.pop(); // opening pair
                }
            }
            else{
                //opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "({})[]"; //true
        System.out.println(isValid(str));

        String isDuplication = "((a+b))";
        System.out.println(isDuplication(str));
    }
}

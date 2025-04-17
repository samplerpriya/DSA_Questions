import java.util.Stack;

public class _Q42_Reverse_String_Using_Stack
{

        public static String reverseString(String str){
            Stack<Character> s = new Stack<>();
            int idx = 0;
            while(idx < str.length()){
                s.push(str.charAt(idx));
                idx++;

            }
            StringBuilder result = new StringBuilder("");
            while(!s.isEmpty()){
                char curr = s.pop();
                result.append(curr);
            }

            return result.toString();
        }

    public static void main(String[] args) {
        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
    }


// print number from n to 1  in recursion (Descending order)

public class _Q24_RecursionDescending
{
    public static void printDec(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }

        System.out.println(n+" ");
        printDec(n - 1);
    }
    public static void main(String[] args) {
        int n = 10;
        printDec(n);
    }
}

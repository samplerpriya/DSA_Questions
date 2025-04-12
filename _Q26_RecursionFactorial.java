// Print factorial of a number n.

public class _Q26_RecursionFactorial
{
//    public static int fact(int n){
//        if(n == 0){
//            return 1;
//        }
//
//        int fnm1 = fact(n - 1);
//        int fn = n * fact(n - 1);
//        return fn;
//    }


    // Print sum of first n natural numbers
    public static int calcSum(int n){
        if(n == 1){
            return 1;
        }
        int Snm1 = calcSum(n - 1);
        int Sn = n + Snm1;
        return Sn;
    }

    public static void main(String[] args) {
        int n = 5;
//        System.out.println(fact(n));
        System.out.println((calcSum(n)));
    }
}

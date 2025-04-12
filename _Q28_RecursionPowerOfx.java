// Write th function to print x to the power n

public class _Q28_RecursionPowerOfx
{
    public static int power(int x, int n)
    {
        // base case
        if(n == 0) {
            return 1;
        }

        //recursive call
        // 
//        power(x, n-1);
//        int xn = x * xnm1;
//        return xn;
        // in a short form
        return x * power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2,10));
    }
}

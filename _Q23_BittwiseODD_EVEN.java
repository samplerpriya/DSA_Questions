// Check is a number is odd or even

public class _Q23_BittwiseODD_EVEN
{
    public static void oddOrEven(int n){
        int bitwise = 1;
        if((n & bitwise) == 0){
            //even number
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(3);
        oddOrEven(11);
        oddOrEven(10);
    }
}

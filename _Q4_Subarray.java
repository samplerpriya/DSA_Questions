// Print subarray
// IMPORTANT FOR TECHNICAL CODING TEST

import java.util.*;

public class _Q4_Subarray
{
    public static void printSubarrays(int numbers[]){
        int ts = 0;
        for(int i = 0; i < numbers.length; i++)
        {
            int start = 1;
            for(int j = 1; j < numbers.length; j++)
            {
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.println(numbers[k]+"");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray" +ts);
    }

    public static void main(String args[])
    {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarrays(numbers);
    }
}

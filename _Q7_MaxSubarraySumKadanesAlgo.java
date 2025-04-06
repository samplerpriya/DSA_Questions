// Find the Maximum Subarray sum using Kadane's algorithm
// TIME COMPLEXITY - O(n)
// very important

import java.util.*;

public class _Q7_MaxSubarraySumKadanesAlgo
{
    public static void kadanes(int arr[])
    {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++)
        {
            currSum = currSum + arr[i];
            if(currSum < 0)
            {
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);

        }

        System.out.println("Our Maximum Subarray sum is : " +maxSum);
    }

    public static void main(String[] args)
    {
        int arr[] = {-2, -3, 4, -1, -2, 5, -3};
        kadanes(arr);
    }

}

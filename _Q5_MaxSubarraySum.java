//BASIC TECHNIQUE to find sum of maximum subarray
// BRUTE FORCE
// TIME COMPLEXITY - O(n3)
// not having optimize solution
// VERY IMPORTANT


import java.util.*;
public class _Q5_MaxSubarraySum
{

        public static void printMaxSumSubarrays(int numbers[]) {
            int currSum = 0;
            int maxSum = Integer.MIN_VALUE;

            for (int i = 0; i < numbers.length; i++) {
                int start = i;

                for (int j = i; j < numbers.length; j++) {
                    int end = j;
                    currSum = 0;
                    for (int k = start; k <= end; k++) {
                        //PRINT SUBARRAY SUM
                        currSum += numbers[k];
                    }
                    System.out.println(currSum);
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }

                }
            }
            System.out.println("max sum = " +maxSum);
        }
        public static void main(String[] args)
        {
            int numbers[] = {2, 4, 6, 8, 9};
            printMaxSumSubarrays(numbers);
        }


}

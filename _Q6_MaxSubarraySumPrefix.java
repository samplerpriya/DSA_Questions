// Find Maximum subarray sum using prefix sum method which is more optimise than brute force method
// very important
// TIME COMPLEXITY = O(n2)

public class _Q6_MaxSubarraySumPrefix
{
    public static void maxSubarraySum(int numbers[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i = 1; i < prefix.length; i++)
        {
            prefix[i] = prefix[i-1] + numbers[i];
        }


        for(int i = 0; i < numbers.length; i++) {
            int start = 1;
            for (int j = 1; j < numbers.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if (maxSum < currSum) {
                    maxSum = currSum;
                }

            }
        }
        System.out.println("max sum =" +maxSum);
    }
    public static void main(String args[])
    {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }

}

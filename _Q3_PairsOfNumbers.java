// Print the pairs of all possible value

public class _Q3_PairsOfNumbers
{
    public static void printPairs(int numbers[])
    {
        for(int i = 0; i < numbers.length; i++)
        {
            int curr = numbers[i];
            for(int j = i + 1; j < numbers.length; j++){
                System.out.println("(" + curr + "," + numbers[i] + ")");

            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int numbers[] = {2, 4, 5, 6, 10};
        printPairs(numbers);
    }
}

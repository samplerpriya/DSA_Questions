import java.util.Scanner;

public class _Q14_2DArray
{

    // Largest number code
    public static int largest(int arr[][]) {
        int largestVal = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if (largestVal < arr[row][col]) {
                    largestVal = arr[row][col];
                }
            }
        }
        return largestVal;
    }


    // Finding the Smallest number
    public static int smallest(int[][] arr){
        int smallestVal = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col <  arr[row].length; col++ ){
                if(smallestVal > arr[row][col]){
                    smallestVal =arr[row][col];
                }
            }
        }
        return smallestVal;
    }

    public static boolean search(int arr[][], int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println("found at cell: (" +row+"," +col+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[][] = new int [3][3];
        // input
        Scanner sc = new Scanner(System.in);
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.println(arr[row][col]);
            }
            System.out.println();
        }
//        System.out.println();
//        search(arr,5);

        System.out.println("Largest no. is " +largest(arr));
//        largest(arr);


        System.out.println("Smallest number is :" +smallest(arr));

    }
}

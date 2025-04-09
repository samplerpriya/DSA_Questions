import java.util.*;

public class _Q12_InsertionSort
{
    public static void insertionSort(int[] arr)
    {
        for(int i = 1; i < arr.length; i++)
        {
            int curr = i;
            int prev = i - 1;
            //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = arr[curr];
        }

    }

    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] +"");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] arr = {5, 3, 7, 1, 9};
        insertionSort(arr);
        printArr(arr);
    }
}


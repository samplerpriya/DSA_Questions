
public class _Q27_RecursionFibonacciSeries
{

    public static int fib(int n){
        if(n == 0){
            return 0;  // also write ie as return n
        } else if (n == 1) {
            return 1; //also write is as return n
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }


    // check if a array is sorted or not
    public static boolean isSorted(int arr[], int i){
        // base case
        if(i == arr.length - 1){
            return true;
        }
        if(arr[i] > arr[i + 1]){
            return false;
        }
        return isSorted(arr, i + 1);
    }



    // Write a function to find the first occurrence of an element in an array
    public static int firstOcuurence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstOcuurence(arr, key, i + 1);
    }


    // Write a function to find the end occurrence of an element in an array
    public static int lastOcurrence(int arr[], int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOcurrence(arr, key, i + 1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;

    }
    public static void main(String[] args) {
//        int n = 28;
//        System.out.println(fib(n));

        // first occurrence
//        int arr[] = {8,3,6,2,6};
//        System.out.println(firstOcuurence(arr, 6, 0));

        // last occurrence
        int arr[] = {8,3,6,2,7,2,4,6};
        System.out.println(lastOcurrence(arr, 6, 0));
    }
}

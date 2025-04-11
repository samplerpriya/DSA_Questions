import java.util.Scanner;

public class _Q16_DiagonalSum_2D_Array
{
    public static int diagonalSum(int matrix[][]){
        int sum = 0;

        //BRUTE FORCE
        // TIME COMPLEXITY - O(N2)

//        for(int row = 0; row < matrix.length; i++)
//        {
//            for(int col = 0; col < matrix[0].length; j++)
//            {
//                if(row == col){
//                    sum += matrix[row][col];
//                }
//                else if(row + col == matrix.length - 1)
//                {
//                    sum += matrix[row][col];
//                }
//            }
//        }


        // Optimized Way
        //TIME COMPLEXITY - O(N)
        for(int i = 0; i < matrix.length; i++){
            //primary diagonal
            sum+= matrix[i][i];


            // i + j = n - 1 ----> j = n - 1 - i
            //secondary diagonal
            if( i != matrix.length - 1 - i) { // overlapping avoid
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;

    }
    public static void main(String[] args)
    {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        System.out.println(diagonalSum(matrix));

    }
}

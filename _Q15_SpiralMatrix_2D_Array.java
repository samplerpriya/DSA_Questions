// Print the spiral matrix
// This question is asked in microsoft, amazon, oracle, apple

import java.util.*;

public class _Q15_SpiralMatrix_2D_Array
{

    public static void printSpiral(int matrix[][])
    {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <= endCol)
        {
            //top
            for(int col = startCol; col <= endCol; col++)
            {
                System.out.println(matrix[startRow][col]);
            }
            
            //right
            for (int row = startRow + 1; row <= endRow; row++)
            {
                System.out.println(matrix[row][endCol]+"");
            }

            //bottom
            for(int col = endCol - 1; col >= startCol; col--)
            {
                if(startRow == endRow) {
                    break;
                }
                System.out.println(matrix[endRow][col]);
            }

            //left
            for(int row = endRow - 1; row >= startRow; row--)
            {
                if(startCol == endCol) {
                    break;
                }
                System.out.println(matrix[row][startCol]);
            }


            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }

        System.out.println();
    }


    public static void main(String [] args)
    {
        int matrix[][] = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15, 16 }};

        printSpiral(matrix);
    }
}

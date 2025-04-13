// ALL POSSIBLE SOLUTION TO PLACE QUEEN
//IN A ROW

//public class _Q31_Backtracking_nQueens
//{
//    public static void nQueens(char board[][], int row){
//        //base
//        if(row == board.length){
//            printBoard(board);
//            return;
//        }
//        //column loop
//        for(int j = 0; j< board.length; j++){
//            board[row][j] = 'Q';
//            nQueens(board, row + 1);  // function call
//            board[row][j] = 'x';  //backtracking step
//        }
//    }
//
//    public static void printBoard(char board[][]){
//        System.out.println("-----------------chess board---------------");
//        for(int i = 0 ; i<board.length; i++){
//            for(int j = 0; j< board.length; j++){
//                System.out.println(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        int n = 2;
//        char board[][] = new char[n][n];
//        //initialize
//        for(int i = 0; i<n; i++){
//            for(int j = 0; j<n; j++){
//                board[i][j] = '.';
//            }
//        }
//        nQueens(board, 0);
//    }
//}



// PLACE THE N QUEEN IN SUCH A THAT NOT ANY QUEEN CAN ATTACT EACH OTHER
public class _Q31_Backtracking_nQueens {
    public static boolean isSafe(char board[][], int row, int col) {
        // Vertical up check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left up check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal right up check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row) {
        // Base case: if all rows are filled, print the board
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Try placing queen in each column
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);  // Recursive call
                board[row][j] = 'x';  // Backtracking step
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("------------- Chess Board -------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;  // Change 'n' to test different board sizes
        char board[][] = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
    }
}



// COUNT THE NUMBER OF WAYS
//public class _Q31_Backtracking_nQueens {
//    public static boolean isSafe(char board[][], int row, int col) {
//        // Vertical up check
//        for (int i = row - 1; i >= 0; i--) {
//            if (board[i][col] == 'Q') {
//                return false;
//            }
//        }
//
//        // Diagonal left up check
//        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//
//        // Diagonal right up check
//        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void nQueens(char board[][], int row) {
//        // Base case: if all rows are filled, print the board
//        if (row == board.length) {
//            count++;
//            return;
//        }
//
//        // Try placing queen in each column
//        for (int j = 0; j < board.length; j++) {
//            if (isSafe(board, row, j)) {
//                board[row][j] = 'Q';
//                nQueens(board, row + 1);  // Recursive call
//                board[row][j] = 'x';  // Backtracking step
//            }
//        }
//    }
//
//    public static void printBoard(char board[][]) {
//        System.out.println("------------- Chess Board -------------");
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    static int count = 0;
//
//    public static void main(String[] args) {
//        int n = 4;  // Change 'n' to test different board sizes
//        char board[][] = new char[n][n];
//
//        // Initialize the board with '.'
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                board[i][j] = 'x';
//            }
//        }
//
//        nQueens(board, 0);
//        System.out.println("total ways to solve n queen=" +count);
//    }
//}




//CHECK IF PROBLEM CAN BE SOLVED AND PRINT ONLY 1 SOLUTION TO N QUEENS PROBLEM
//public class _Q31_Backtracking_nQueens {
//    public static boolean isSafe(char board[][], int row, int col) {
//        // Vertical up check
//        for (int i = row - 1; i >= 0; i--) {
//            if (board[i][col] == 'Q') {
//                return false;
//            }
//        }
//
//        // Diagonal left up check
//        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//
//        // Diagonal right up check
//        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
//            if (board[i][j] == 'Q') {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static boolean nQueens(char board[][], int row) {
//        // Base case: if all rows are filled, print the board
//        if (row == board.length) {
////            printBoard(board);
//            return true;
//        }
//
//        // Try placing queen in each column
//        for (int j = 0; j < board.length; j++) {
//            if (isSafe(board, row, j)) {
//                board[row][j] = 'Q';
//               if(nQueens(board, row + 1)){
//                   return true;
//               }
//                board[row][j] = 'x';  // Backtracking step
//            }
//        }
//        return false;
//    }
//
//    public static void printBoard(char board[][]) {
//        System.out.println("------------- Chess Board -------------");
//        for (int i = 0; i < board.length; i++) {
//            for (int j = 0; j < board.length; j++) {
//                System.out.print(board[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = 4;  // Change 'n' to test different board sizes
//        char board[][] = new char[n][n];
//
//        // Initialize the board with '.'
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                board[i][j] = 'x';
//            }
//        }
//
//        if(nQueens(board, 0)){
//            System.out.println("solution is possible");
//            printBoard(board);
//        }
//        else{
//            System.out.println("solution is not possible");
//        }
//    }
//}
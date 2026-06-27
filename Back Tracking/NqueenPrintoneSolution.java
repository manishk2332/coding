public class NqueenPrintoneSolution {

    public static boolean issafe(char board[][], int row, int col) {

        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') return false;
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static boolean Nqueen(char board[][], int row) {

        // base case
        if (row == board.length) {
            return true; // stop at first solution
        }

        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';

                if (Nqueen(board, row + 1)) {
                    return true; // solution found → stop
                }

                board[row][j] = 'x'; // backtrack
            }
        }
        return false;
    }

    public static void printboard(char board[][]) {
        System.out.println("-------chessboard-----");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
         int n = 4;
        // int n = 2;
        char board[][] = new char[n][n];

        // initialize
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        if (Nqueen(board, 0)) {
            System.out.println("Solution found:");
            printboard(board); // print only once
        } else {
            System.out.println("No solution exists");
        }
    }
}
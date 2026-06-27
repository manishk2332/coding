public class Nqueen{
    public static boolean issafe(char board[][], int row,int col){
   // vertical up
   for(int i=row-1;i>=0; i--){
    if(board[i][col]=='Q'){
        return false;
    }
   }

   // diagonal left up
   for(int i=row-1 , j=col-1; i>=0 && j>=0; i--,j--){
    if (board[i][j] == 'Q'){
        return false;
    }
   }

   // diagonal right up
     for(int i=row-1 , j=col+1; i>=0 && j<board.length; i--,j++){
    if (board[i][j] == 'Q'){
        return false;
    }
     }

    return true;
  }
    public static void Nqueen(char board[][], int row){

        //base case
        if(row == board.length){
            printboard(board);
            count++;                         // for : no of ways
            return;
        }
         // column loop
        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
            board[row][j]='Q';
            Nqueen (board,row+1);    //function call
            board[row][j]='x';      // backtracking step
        }

    }
}

public static void printboard(char board[][]){
    System.out.println("-------chessboard-----");

        for(char[] board1 : board) {
            for (int j = 0; j<board.length; j++) {
                System.out.print(board1[j] + " ");
            }
            System.out.println();
        }
}

  static int count = 0;                    // for : no of ways
    public static void main(String args[]){
        int n=4;
        char board[][]=new char[n][n];

        // initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='x';

            }
        }
        Nqueen(board,0);
        System.out.println("total ways to solve N queen = " + count);     // for : no of ways
    }

}
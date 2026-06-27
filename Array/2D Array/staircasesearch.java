public class staircasesearch{
    public static boolean staircasesearch(int matrix[][],int key){
        // int row=0;                                     // start from top right corner
        // int col =matrix[0].length-1;

        // while(row<matrix.length && col>=0){
        //     if (matrix[row][col]==key){
        //         System.out.println("found key at ("+row+" ,"+col+") ");
        //         return true;
        //     }
        //     else if(key < matrix[row][col]){
        //         col--;
        //     }else{                                                         //Time Complexity:   O(n + m) (very efficient)

        //         row++;
        //     }
        // }
        int row = matrix.length - 1;   // start from last row
        int col = 0;                  // first column

        while (row >= 0 && col < matrix[0].length) {

            if (matrix[row][col] == key) {
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            }

            else if (key > matrix[row][col]) {
                col++;   // move right ➡️
            }

            else {
                row--;   // move up ⬆️
            }
        }
        System.out.println("found not key");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        //int key=33;
        int key=33;
        staircasesearch(matrix,key);
    }
    }

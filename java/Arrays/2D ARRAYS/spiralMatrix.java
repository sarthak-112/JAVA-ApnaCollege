public class spiralMatrix {
    public static void printSpriral(int matrix[][]){
        int startRow = 0, endRow = matrix.length-1;
        int startCol = 0, endCol = matrix[0].length-1;

        while(startRow<=endRow && startCol<=endCol){
           for(int j=startCol;j<=endCol;j++){
               System.out.print(matrix[startRow][j]+" ");
           }
           for(int i=startRow+1;i<=endRow;i++){
               System.out.print(matrix[i][endCol]+" ");
           }
           for(int j=endCol-1;j>=startCol;j--){
               System.out.print(matrix[endRow][j]+" ");
           }
           for(int i=endRow-1;i>=startRow+1;i--){
               System.out.print(matrix[i][startCol]+" ");
           }
           startCol++;
           startRow++;
           endCol--;
           endRow--;
        }
    }
    public static void main(String[] args) {
    int matrix[][] = {{1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}};
    printSpriral(matrix);
    }
}

public class AmazonProblemTiling {
    public static void main(String[] args) {
        int  n=10;
        System.out.println(tilingProblen(n));
    }
    public static int tilingProblen(int n){
        if (n==0 || n==1) {
            return n;
        }
        // 2 x n board


        //kaam
        // 1. 2 x 1 tiles vertical tiles
        int verticalTiles = tilingProblen(n-1);
        // 2. 2 x 2 horizontal tiles
        int horizontalTiles = tilingProblen(n-2);
         int totWays = verticalTiles + horizontalTiles;
         return     totWays;
    }
}

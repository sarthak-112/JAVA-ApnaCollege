public class maxsubArray {
    public static void main(String[] args) {
        int num[]={2,3,4,5,6,7,8,9,0};
        printSub(num);
        
    }
    public static  void printSub(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                
            }
            
        }
        System.out.println("max sum="+maxSum);
    }
}

public class pairsArray {
 public static void main(String[] args) {
    int nums[]={2,4,6,8,10};
    printPair(nums);
 }  
 public static void printPair(int nums[]){
    for(int i=0;i<nums.length;i++){
        int curr=nums[i];
        for(int j=i+1;j<nums.length;j++){
            System.out.print("("+curr+","+nums[j]+") ");
        }
        System.out.println();
    }
    
 } 
}

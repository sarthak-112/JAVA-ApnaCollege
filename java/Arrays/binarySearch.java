public class binarySearch {
    public static void main(String[] args) {
        int num[]={2,4,6,8,10,12,14,15};
        int key=25;
        System.out.println("index for key is " + binarySearch123(num, key));
    }
    public static int binarySearch123(int num[], int key){
        int start=0, end = num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
}

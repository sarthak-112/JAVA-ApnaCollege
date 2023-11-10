public class lastOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,6,7,8,8,9,10};
        int key = 2;
        System.out.println(lastOcc(arr, key, 0));
    }
    public static int lastOcc(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        int restArray = lastOcc(arr, key, i+1);
        if(restArray!=-1){
            return restArray;
        }
        if(arr[i]==key){
            return i;
        }
        return -1;
    }
}

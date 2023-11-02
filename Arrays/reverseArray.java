public class reverseArray {
    public static void main(String[] args) {
        int num[]={3,4,5,6,7,8,9,0};
        reverse(num);
        for(int i=0;i<num.length-1;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
    public static void reverse(int num[]){
        int first = 0, last = num.length-1;
        while(first<last){
            int temp = num[last];
            num[last]= num[first];
            num[first]=temp;
            first++;
            last--;
        }
    }
}

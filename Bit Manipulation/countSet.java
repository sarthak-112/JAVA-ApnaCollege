public class countSet {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(countSetBits(num));
    }
    public static int countSetBits(int num){
        int count=0;
        while(num>0){
            if ((num&1)!=0) {
                count++;
            }
            num=num>>1;
        }
        return count;
    }
}

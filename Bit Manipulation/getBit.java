public class getBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;
        getBits(n,i);
    }
    public static void getBits(int n,int i){
        int bitMask=1<<i;
        if((n&bitMask)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }

    }
}

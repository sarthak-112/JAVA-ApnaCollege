public class clearBit {
    public static void main(String[] args) {
        int num=5;
        int i=1;
        System.out.println(clearBits(num, i));
    }
    public static int clearBits(int num, int i){
        int bitMask=1<<i;
        bitMask=~bitMask;
        return num&bitMask;
    }
}

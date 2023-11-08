public class updateBit {
    public static void main(String[] args) {
        int num = 12;
        int i=3;
        System.out.println(updateBits(num, i, 0));
    }
    public static int updateBits(int num, int i, int newBit){
        int bitMask=1<<i;
        bitMask=~bitMask;
        num=num&bitMask;
        int BitMask = newBit<<i;
        return num|BitMask;
    }
}

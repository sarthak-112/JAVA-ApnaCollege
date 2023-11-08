public class clearBits {
    public static void main(String[] args) {
        int num = 12;
        int i=3;
        System.out.println(clearBitsss(num, i));
    }
    public static int clearBitsss(int num, int i){
        int bitMask=(-1<<i);
        return num&bitMask;
    } 
}

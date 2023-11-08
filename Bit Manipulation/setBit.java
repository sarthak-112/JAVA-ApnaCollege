public class setBit {
    public static void main(String[] args) {
        int num=5;
        int i=1;
        System.out.println(setBits(num, i));
    }
    public static int setBits(int num, int i){
        int bitMask=1<<i;
        return num|bitMask;
    }
}

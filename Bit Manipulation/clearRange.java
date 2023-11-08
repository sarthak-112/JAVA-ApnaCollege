public class clearRange {
    public static void main(String[] args) {
        int num = 10;
        int i=2;
        int j=4;
        System.out.println(clearRanges(num, i, j));
    }
    public static int clearRanges(int num, int i, int j){
        int a = (-1<<(j+1));
        int b = (1<<i)-1;
        return num&(a|b);
    }
}

public class isPower2 {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(isPower(num));
    }
    public static boolean isPower(int num){
        return (num&(num-1))==0;
    }
}

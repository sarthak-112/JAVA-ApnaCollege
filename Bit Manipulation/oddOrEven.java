public class oddOrEven {
    public static void oddOreven(int num) {
        int bitMask = 1;
        if( (num & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        oddOreven(5);
        oddOreven(6);
    }
}
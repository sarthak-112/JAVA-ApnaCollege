public class increasing {
    public static void main(String[] args) {
        int n = 5;
        isIncreasing(n);
    }
    public static void isIncreasing(int n){
        if(n==1){
            System.out.print("1 ");
            return;
        }
        isIncreasing(n-1);
        System.out.print(n + " ");
    }
}
